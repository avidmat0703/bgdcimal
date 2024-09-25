package org.iesvdm.Ejercicios.Ej3;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variables iniciales
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del préstamo: ");
        BigDecimal principal = scanner.nextBigDecimal();

        System.out.print("Ingrese la tasa de interés anual (Ej: 5 para 5%): ");
        BigDecimal InteresesAnual = scanner.nextBigDecimal().divide(new BigDecimal(100));

        System.out.print("Ingrese la duración del préstamo en años: ");
        int DuracionPrestamo = scanner.nextInt();

        int PagoPorAño = 12;
        int PagosTotales = DuracionPrestamo * PagoPorAño;

        //Tasa de interés mensual
        BigDecimal InteresMensual = InteresesAnual.divide(new BigDecimal(PagoPorAño), 10, RoundingMode.HALF_EVEN);

        //PMT
        BigDecimal one = BigDecimal.ONE;
        BigDecimal factor = one.add(InteresMensual).pow(-PagosTotales, new MathContext(10, RoundingMode.HALF_EVEN));
        BigDecimal PagoMensual = principal.multiply(InteresMensual).divide(one.subtract(factor), 10, RoundingMode.HALF_EVEN);

        //Cabezera
        System.out.println("Mes\t\tPago\t\tPrincipal\tInterés\t\tBalance");
        System.out.println("-----------------------------------------------------");

        BigDecimal balance = principal;
        BigDecimal InteresTotal = BigDecimal.ZERO;

        for (int Mes = 1; Mes <= PagosTotales; Mes++) {
            //Pago de interés del mes
            BigDecimal PagoInteres = balance.multiply(InteresMensual).setScale(10, RoundingMode.HALF_EVEN);

            //Pago al principal
            BigDecimal PagoAlPrincipal = PagoMensual.subtract(PagoInteres).setScale(10, RoundingMode.HALF_EVEN);

            //Balance pendiente
            balance = balance.subtract(PagoAlPrincipal).setScale(10, RoundingMode.HALF_EVEN);

            //Interés total pagado
            InteresTotal = InteresTotal.add(PagoInteres);

            //Detalles del mes actual
            System.out.printf("%d\t\t%s\t\t%s\t\t%s\t\t%s%n", Mes, format(PagoMensual), format(PagoAlPrincipal), format(PagoInteres), format(balance));
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Interés total pagado: " + format(InteresTotal) + "€");
    }

    //Auxiliar para formatear BigDecimal
    private static String format(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_EVEN).toString();
    }
}

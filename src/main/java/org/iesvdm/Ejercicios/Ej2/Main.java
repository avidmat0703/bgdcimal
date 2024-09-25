package org.iesvdm.Ejercicios.Ej2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el monto principal: ");
        BigDecimal principal = scanner.nextBigDecimal();

        System.out.print("Introduce la tasa de interés anual en formato decimal (Ej: 0,05 para 5%): ");
        BigDecimal tasaInteres = scanner.nextBigDecimal();

        System.out.print("Introduce el número de años: ");
        int años = scanner.nextInt();

        BigDecimal montoFinal = calcularInteresCompuesto(principal, tasaInteres, años);

        System.out.println("El monto total después de " + años + " años es: " + montoFinal.setScale(10, RoundingMode.HALF_EVEN));
    }

    // c = p * (1 + r)^n
    public static BigDecimal calcularInteresCompuesto(BigDecimal p, BigDecimal r, int n) {
        //(1 + r)
        BigDecimal UnoMasR = BigDecimal.ONE.add(r);

        //Elevar (1 + r)^n
        BigDecimal potencia = UnoMasR.pow(n);

        //Multiplicar p*(1 + r)^n y operar con 10 decimales con redondeo bancario HALF_EVEN
        return p.multiply(potencia).setScale(10, RoundingMode.HALF_EVEN);
    }
}
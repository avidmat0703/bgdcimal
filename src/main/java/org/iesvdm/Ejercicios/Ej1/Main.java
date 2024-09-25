package org.iesvdm.Ejercicios.Ej1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para calcular su factorial: ");
        int n = scanner.nextInt();

        BigInteger factorial = factorial(n);

        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
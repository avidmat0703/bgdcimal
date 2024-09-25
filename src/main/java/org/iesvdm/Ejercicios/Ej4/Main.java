package org.iesvdm.Ejercicios.Ej4;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Punto P1 = new Punto(52.52437f, 13.41053f); // Berlín
        Punto P2 = new Punto(36.7213028f, -4.4216366f); // Málaga

        BigDecimal distancia = Punto.Extension.DistanciaKm(P1, P2);
        System.out.println("La distancia entre Berlin y Málaga es de: " + distancia + "Km");
    }
}
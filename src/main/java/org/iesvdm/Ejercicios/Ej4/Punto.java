package org.iesvdm.Ejercicios.Ej4;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Punto {

    private BigDecimal Latitud;
    private BigDecimal Longitud;

    public Punto(float Latitud, float Longitud) {
        this.Latitud = new BigDecimal(Float.toString(Latitud));
        this.Longitud = new BigDecimal(Float.toString(Longitud));
    }

    public BigDecimal getLatitud() {
        return Latitud;
    }

    public Punto setLatitud(float latitud) {
        this.Latitud = new BigDecimal(Float.toString(latitud));
        return this;
    }

    public BigDecimal getLongitud() {
        return Longitud;
    }

    public Punto setLongitud(float longitud) {
        this.Longitud = new BigDecimal(Float.toString(longitud));
        return this;
    }

    public String toString() {
        return "Posicion [Latitud=" + Latitud + ", Longitud=" + Longitud + "]";
    }

    public static class Extension {
        public static final BigDecimal KmRadioTierra = new BigDecimal("6378.0");

        public static BigDecimal DistanciaKm(Punto P1, Punto P2) {

            MathContext mc = new MathContext(34, RoundingMode.HALF_UP);

            BigDecimal Latitud1 = ARadianes(P1.getLatitud().floatValue());
            BigDecimal Longitud1 = ARadianes(P1.getLongitud().floatValue());

            BigDecimal Latitud2 = ARadianes(P2.getLatitud().floatValue());
            BigDecimal Longitud2 = ARadianes(P2.getLongitud().floatValue());

            BigDecimal dLatitud = Latitud2.subtract(Latitud1);
            BigDecimal dLongitud = Longitud2.subtract(Longitud1);

            BigDecimal sinDLatDiv2 = BigDecimal.valueOf(Math.sin(dLatitud.divide(new BigDecimal("2.0"), mc).doubleValue()));
            BigDecimal sinDLonDiv2 = BigDecimal.valueOf(Math.sin(dLongitud.divide(new BigDecimal("2.0"), mc).doubleValue()));

            BigDecimal a = sinDLatDiv2.pow(2).add(BigDecimal.valueOf(Math.cos(Latitud1.doubleValue())).multiply(BigDecimal.valueOf(Math.cos(Latitud2.doubleValue()))).multiply(sinDLonDiv2.pow(2)));

            BigDecimal b = BigDecimal.valueOf(2).multiply(BigDecimal.valueOf(Math.atan2(Math.sqrt(a.doubleValue()), Math.sqrt(1 - a.doubleValue()))));

            BigDecimal distancia = KmRadioTierra.multiply(b, mc);

            return distancia;
        }

        public static BigDecimal ARadianes(float valor) {
            BigDecimal BD = new BigDecimal(Float.toString(valor));
            BigDecimal PI = new BigDecimal(Math.PI);
            return BD.multiply(PI).divide(new BigDecimal("180"), 10, RoundingMode.HALF_UP);
        }
    }
}
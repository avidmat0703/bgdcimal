package org.iesvdm.Ejercicios.Ej5;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String number;
    private String shipTo;
    private BigDecimal total;
    private ShoppingCart s;

    public Order(String number, String shipTo, BigDecimal total, ShoppingCart s) {
        this.number = number;
        this.shipTo = shipTo;
        this.total = total;
        this.s = s;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getShipTo() {
        return shipTo;
    }

    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ShoppingCart getS() {
        return s;
    }

    public void setS(ShoppingCart s) {
        this.s = s;
    }
}
package org.iesvdm.Ejercicios.Ej5;

import java.math.BigDecimal;

public class Payment {
    private String id;
    private BigDecimal total;
    private String details;
    private ShoppingCart s;

    public Payment(String id, BigDecimal total, String details, ShoppingCart s) {
        this.id = id;
        this.total = total;
        this.details = details;
        this.s = s;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public ShoppingCart getS() {
        return s;
    }

    public void setS(ShoppingCart s) {
        this.s = s;
    }
}
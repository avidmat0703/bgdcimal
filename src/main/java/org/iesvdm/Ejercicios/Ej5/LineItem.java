package org.iesvdm.Ejercicios.Ej5;

import java.math.BigDecimal;

public class LineItem {
    private int quantity;
    private BigDecimal price;

    public LineItem(int quantity, BigDecimal price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
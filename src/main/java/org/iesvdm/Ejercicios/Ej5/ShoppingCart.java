package org.iesvdm.Ejercicios.Ej5;

import java.util.Date;

public class ShoppingCart {
    private Date created;
    private WebUser w;
    private Account a;

    public ShoppingCart(WebUser w, Account a) {
        this.created = created;
        this.w = w;
        this.a = a;
    }

    public WebUser getW() {
        return w;
    }

    public void setW(WebUser w) {
        this.w = w;
    }

    public Account getA() {
        return a;
    }

    public void setA(Account a) {
        this.a = a;
    }
}
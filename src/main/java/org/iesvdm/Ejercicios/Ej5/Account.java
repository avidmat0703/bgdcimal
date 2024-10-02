package org.iesvdm.Ejercicios.Ej5;

import java.util.Date;

public class Account {
    private String id;
    private String adress;
    private boolean closed;

    public Account(String id, String adress, boolean closed){
        this.id = id;
        this.adress = adress;
        this.closed = closed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
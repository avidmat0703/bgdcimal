package org.iesvdm.Ejercicios.Ej5;

public class Customer {
    private String id;
    private String adress;
    private String phone;
    private String email;

    public Customer(String id, String adress, String phone, String email) {
        this.id = id;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
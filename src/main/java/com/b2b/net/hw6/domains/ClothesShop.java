package com.b2b.net.hw6.domains;

public class ClothesShop {

    /**
     * NAPISZ KONSTRUKTOR INICJUJACY WSZYSTKIE POLA, GETTERY I SETTERY
     */
    private String name;
    private String phone;
    private String street;
    private String postal_code;
    private String city;
    private Client client;
    private Cloth cloth;



    public ClothesShop(String name, String phone, String street, String postal_code, String city, Client client, Cloth cloth){
        this.name = name;
        this.phone = phone;
        this.street = street;
        this.postal_code = postal_code;
        this.city = city;
        this.client = client;
        this.cloth = cloth;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

}

package com.b2b.net.hw6.domains;

public class Cloth {

    /**
     * NAPISZ KONSTRUKTOR INICJUJACY WSZYSTKIE POLA, GETTERY I SETTERY
     */
    private String name;
    private double price;
    private String size;
    private String brand;

    public Cloth(String name, double price, String size, String brand) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.brand = brand;
    }

    public Cloth(){

    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String name) {
        this.name = name;
    }
}

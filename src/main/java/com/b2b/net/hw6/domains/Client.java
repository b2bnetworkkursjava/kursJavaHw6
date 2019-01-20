package com.b2b.net.hw6.domains;

/**
 * Hello world!
 *
 */
public class Client
{

    /**
     * NAPISZ KONSTRUKTOR INICJUJACY WSZYSTKIE POLA, GETTERY I SETTERY
     */
    private String name;
    private String surname;
    private int age;
    private String phone;
    private String street;
    private String city;
    private String postal_code;
    private Cloth cloth;

    public Client(String name, String surname, int age, String phone, String street, String city, String postal_code, Cloth cloth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
        this.street = street;
        this.city = city;
        this.postal_code = postal_code;
        this.cloth = cloth;
    }
    public Client() {

    }

    public int getAge() {
        return this.age;
    }

    public String getPhone() {
        return phone;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname (){
        return surname;
    }

}

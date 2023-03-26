package h1_8;

import java.util.Scanner;

public class Address {
    private String street;
    private int number;
    private City city;


    public Address(String street, int number, City city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", city=" + city +
                '}';
    }
}

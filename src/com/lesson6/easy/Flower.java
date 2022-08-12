package com.lesson6.easy;

public class Flower {
    public static int numberOfFlowers;
    public String produceCountry;
    public int expirationDate;
    public int price;


    public Flower(String produceCountry, int expirationDate, int price) {
        this.produceCountry = produceCountry;
        this.expirationDate = expirationDate;
        this.price = price;

        numberOfFlowers++;
    }
}

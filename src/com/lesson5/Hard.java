package com.lesson5;

import java.util.Arrays;

public class Hard {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Apple");
        product.setRating(4.5);
        product.setPrice(24);
        Product[] productCategory1 = {product};

        Product product2 = new Product();
        product2.setName("Orange");
        product2.setRating(4.3);
        product2.setPrice(20);
        Product[] productCategory2 = {product2};

        Category category1 = new Category();
        category1.setName("apples");
        category1.setProducts(productCategory1);

        Category category2 = new Category();
        category2.setName("Citrus");
        category2.setProducts(productCategory2);



        User user = new User();
        Basket basket = new Basket();
        basket.setBoughtProducts(productCategory1);

        user.setLogin("Ivan");
        user.setPassword(123);
        user.setBasket(basket);

    }
}
class Product {
    private String name;
    private int price;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}

class Category {
    private String name;
    private Product[] products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}

class Basket {
    private Product[] boughtProducts;

    public Product[] getBoughtProducts() {
        return boughtProducts;
    }

    public void setBoughtProducts(Product[] boughtProducts) {
        this.boughtProducts = boughtProducts;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "boughtProducts=" + Arrays.toString(boughtProducts) +
                '}';
    }
}

class User {
    private String login;
    private int password;
    private Basket basket;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password=" + password +
                ", basket=" + basket +
                '}';
    }
}
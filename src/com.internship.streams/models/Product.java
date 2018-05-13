package com.internship.streams.models;

public class Product {
    private double price;
    private String name;

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    private int id;

    public Product(double price, String name, int id) {
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

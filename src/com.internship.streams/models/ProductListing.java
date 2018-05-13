package com.internship.streams.models;

import java.util.ArrayList;

public class ProductListing {
    ArrayList<Product> products = new ArrayList<>();

    public ProductListing(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}

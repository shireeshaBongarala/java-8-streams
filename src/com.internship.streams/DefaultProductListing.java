package com.internship.streams;

import com.internship.streams.models.Product;
import com.internship.streams.models.ProductListing;

import java.util.ArrayList;

public class DefaultProductListing {

    public static ProductListing getDefaultProductListing() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(30.0, "Nike Shoes", 1215686));
        products.add(new Product(40.0, "Puma Shoes", 8923412));
        products.add(new Product(10.0, "Bata Shoes(S)", 8776772));
        products.add(new Product(75.0, "Bata Shoes(L)", 1224343));
        products.add(new Product(30.0, "Bata Shoes(M)", 8776733));
        return new ProductListing(products);
    }
}

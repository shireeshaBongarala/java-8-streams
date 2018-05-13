package com.internship.streams;

import com.internship.streams.models.Product;
import com.internship.streams.models.ProductListing;

import java.util.ArrayList;

public class PriceSorter {
    /* Given the products and the prices, our task is to sort the products in ascending order of their prices  and display to customer*/
    public static void main(String[] args) {
        ProductListing productListing = DefaultProductListing.getDefaultProductListing();

        ArrayList<Product> productsWithPriceLessThanFiftyUnits = sortProductsInAscendingOrder(productListing);

        for (Product productsWithPriceLessThanFiftyUnit : productsWithPriceLessThanFiftyUnits) {
            System.out.println(productsWithPriceLessThanFiftyUnit.toString());
        }
    }

    private static ArrayList<Product> sortProductsInAscendingOrder(ProductListing productListing) {
        return productListing.getProducts();
    }
}

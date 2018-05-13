package com.internship.streams;

import com.internship.streams.models.Product;
import com.internship.streams.models.ProductListing;

import java.util.ArrayList;

public class PriceFilter {
    public static void main(String[] args) {
       ProductListing productListing = DefaultProductListing.getDefaultProductListing();

        ArrayList<Product> productsWithPriceLessThanFiftyUnits = filterProductsFromProductListing(productListing, 50);

        for (Product productsWithPriceLessThanFiftyUnit : productsWithPriceLessThanFiftyUnits) {
            System.out.println(productsWithPriceLessThanFiftyUnit.toString());
        }
    }

    private static ArrayList<Product> filterProductsFromProductListing(ProductListing productListing, int maxPrice) {
        return productListing.getProducts();
    }
}

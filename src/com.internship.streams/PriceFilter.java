package com.internship.streams;

import com.internship.streams.models.Product;
import com.internship.streams.models.ProductListing;

import java.util.ArrayList;

public class PriceFilter {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(30.0, "Nike Shoes", 1215686));
        products.add(new Product(40.0, "Puma Shoes", 8923412));
        products.add(new Product(10.0, "Bata Shoes(S)", 8776772));
        products.add(new Product(75.0, "Bata Shoes(L)", 1224343));
        products.add(new Product(30.0, "Bata Shoes(M)", 8776733));
        ProductListing productListing = new ProductListing(products);

        ArrayList<Product> productsWithPriceLessThanFiftyUnits = filterProductsFromProductListing(productListing, 50);

        for (Product productsWithPriceLessThanFiftyUnit : productsWithPriceLessThanFiftyUnits) {
            System.out.println(productsWithPriceLessThanFiftyUnit.toString());
        }
    }

    private static ArrayList<Product> filterProductsFromProductListing(ProductListing productListing, int maxPrice) {
        return productListing.getProducts();
    }
}

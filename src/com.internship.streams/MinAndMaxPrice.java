package com.internship.streams;

import com.internship.streams.models.ProductListing;

public class MinAndMaxPrice {
    /* Given the products and the prices, our task is to find the min and max price of the product on the product listing page*/
    public static void main(String[] args) {
        ProductListing productListing = DefaultProductListing.getDefaultProductListing();

        double minPrice = getMinPrice(productListing);
        double maxPrice = getMaxPrice(productListing);

        System.out.println("MinPrice: " + minPrice + ", MaxPrice: " + maxPrice);
    }

    private static double getMinPrice(ProductListing productListing) {
        return 0.0;
    }

    private static double getMaxPrice(ProductListing productListing) {
        return 0.0;
    }
}

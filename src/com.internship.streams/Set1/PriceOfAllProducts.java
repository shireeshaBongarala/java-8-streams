package com.internship.streams.Set1;

import com.internship.streams.models.ProductListing;

public class PriceOfAllProducts {
    /* Given the products and the prices, our task is to find sum of all the prices on the product listing page*/
    public static void main(String[] args) {
        ProductListing productListing = DefaultProductListing.getDefaultProductListing();

        double totalPriceOfAllTheProducts = getTotalPriceOfAllTheProducts(productListing);

        System.out.println(totalPriceOfAllTheProducts);
    }

    private static double getTotalPriceOfAllTheProducts(ProductListing productListing) {
        return 0.0;
    }
}

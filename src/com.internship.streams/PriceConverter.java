package com.internship.streams;

import com.internship.streams.models.Product;
import com.internship.streams.models.ProductListing;

public class PriceConverter {
    /* Given that the price for products are in dollars, we need to convert them into Rupees for our Indian customers (round off to two decimal places)*/
    public static void main(String[] args) {
       ProductListing productListing = DefaultProductListing.getDefaultProductListing();

       ProductListing productListingInINR = getProductListingInRupees(productListing, 67.36);
        for (Product product : productListingInINR.getProducts()) {
            System.out.println(product.toString());
        }
    }

    private static ProductListing getProductListingInRupees(ProductListing productListing, double conversionRate) {
        return productListing;
    }

}


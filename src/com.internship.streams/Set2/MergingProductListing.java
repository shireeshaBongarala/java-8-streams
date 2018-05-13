package com.internship.streams.Set2;

import com.internship.streams.Set1.DefaultProductListing;
import com.internship.streams.models.Product;
import com.internship.streams.models.ProductListing;

import java.util.ArrayList;

public class MergingProductListing {

    /* Given two product listing pages, our task is to merge them into a single product listing page*/

    public static void main(String[] args) {
        ProductListing productListing = DefaultProductListing.getDefaultProductListing();
        ArrayList<Product> seasonalProducts = new ArrayList<>();
        seasonalProducts.add(new Product(20.0, "NM Shoes", 1215686));
        seasonalProducts.add(new Product(24.0, "PA Shoes", 8923412));
        ProductListing festiveProductListing = new ProductListing(seasonalProducts);

        ProductListing mergedProductListing = getMergedProductListing(productListing, festiveProductListing);
        for (Product product : mergedProductListing.getProducts()) {
            System.out.println(product.toString());
        }
    }

    private static ProductListing getMergedProductListing(ProductListing productListing, ProductListing festiveProductListing) {

        return productListing;
    }
}

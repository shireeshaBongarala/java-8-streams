package com.internship.streams.Set2;

import com.internship.streams.Set1.DefaultProductListing;
import com.internship.streams.models.Product;
import com.internship.streams.models.ProductListing;

import java.util.ArrayList;

public class DuplicateProducts {
    /* Seems like there are some duplicate entries in our product listing.
    Let's remove them so as we don't confuse the user with same products appearing multiple times on the product listing page
     */

    public static void main(String[] args) {
        ProductListing productListing = DefaultProductListing.getDefaultProductListing();
        ArrayList<Product> dupliateProducts = new ArrayList<>();
        dupliateProducts.add(new Product(30.0, "Nike Shoes", 1215686));
        dupliateProducts.add(new Product(40.0, "Puma Shoes", 8923412));
        productListing.getProducts().addAll(dupliateProducts);
        ProductListing mergedProductListing = getProductListingWithoutDuplicates(productListing);
        for (Product product : mergedProductListing.getProducts()) {
            System.out.println(product.toString());
        }
    }

    private static ProductListing getProductListingWithoutDuplicates(ProductListing productListing) {

        return productListing;
    }
}

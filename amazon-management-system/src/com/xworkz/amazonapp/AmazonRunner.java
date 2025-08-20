package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;

public class AmazonRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println();

        Product productOne = new Product();
        productOne.setProductId(101);
        productOne.setProductName("Galaxy F34 5G");
        productOne.setCategoryOfProduct("Electronics");
        productOne.setBrandName("Samsung");
        productOne.setPrice(19000.00);
        productOne.setManufacturerName("Samsung private Ltd.");

        Amazon amazon =new Amazon();
        boolean isProductAdded=amazon.addProduct(productOne);
        System.out.println("Is Product Added? "+isProductAdded);

        if (isProductAdded)
            amazon.getProductDetails();
        System.out.println();
        boolean isPriceUpdated=amazon.updateProductPrice(25000.00);
        System.out.println("Is Price Updated? "+isPriceUpdated);
        System.out.println("Updated Details of product is : ");
        amazon.getProductDetails();
        System.out.println();
        boolean isProductDeleted=amazon.deleteProduct(productOne);
        System.out.println("Is Product deleted? "+isProductDeleted);
        System.out.println();
        System.out.println("main ended");
    }
}

package com.xworkz.amazonapp.validator;

import com.xworkz.amazonapp.product.Product;

public class ProductValidator {


    public boolean validateProduct(Product product){
        boolean isProductValidated=false;
        boolean isProductIdValid=false;
        boolean isProductNameValid=false;
        boolean isCategoryOfProductValid=false;
        boolean isBrandNameValid=false;
        boolean isPriceValid=false;
        boolean isManufacturerNameValid=false;
        boolean isProductAvailabilityValid=false;

        if (product.getProductId()!=0)
            isProductIdValid=true;
        else System.out.println("Invalid Product Id");

        if (product.getProductName()!=null && !product.getProductName().isEmpty())
            isProductNameValid=true;
        else System.out.println("Invalid Product Name");

        if (product.getCategoryOfProduct()!=null && !product.getCategoryOfProduct().isEmpty())
           isCategoryOfProductValid=true;
        else System.out.println("Invalid category of product");

        if (product.getBrandName()!=null)
            isBrandNameValid=true;
        else System.out.println("Invalid brand name");

        if (product.getPrice()!=0.0)
            isPriceValid=true;
        else System.out.println("Invalid price");

        if (product.getManufacturerName()!=null && !product.getManufacturerName().isEmpty())
            isManufacturerNameValid=true;
        else System.out.println("Invalid manufacturer name");

        if (product.getProductAvailability()!=null) isProductAvailabilityValid=true;
        else System.out.println("Invalid product availability");

        if (isProductIdValid && isProductNameValid && isCategoryOfProductValid && isBrandNameValid && isPriceValid && isManufacturerNameValid && isProductAvailabilityValid){
            isProductValidated=true;
        }else System.out.println("Product not validated!!!");

        return isProductValidated;
    }
}

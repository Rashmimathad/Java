package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.validator.ProductValidator;

public class Amazon {
    Product product;

    public boolean addProduct(Product product){
        boolean isProductAdded=false;

        ProductValidator validateProduct = new ProductValidator();
        boolean isProductValidated=validateProduct.validateProduct(product);

        if (isProductValidated){
            this.product=product;
            isProductAdded=true;
        }

        return isProductAdded;
    }

   public boolean updateProductPrice(double price){
        boolean isPriceUpdated=false;
      if (price>0){
          this.product.setPrice(price);
          isPriceUpdated=true;
      }else System.out.println("Product price must be greater than Zero");

      return isPriceUpdated;
   }

   public boolean deleteProduct(Product product){
        boolean isProductDeleted=false;

        this.product=null;
        isProductDeleted=true;

        return isProductDeleted;
   }

   public void getProductDetails(){
        System.out.println("Product Id is : "+product.getProductId());
        System.out.println("Product Name is : "+product.getProductName());
        System.out.println("category of the product is : "+product.getCategoryOfProduct());
        System.out.println("Brand Name of the product is : "+product.getBrandName());
        System.out.println("Price of the product is : "+product.getPrice());
        System.out.println("Manufacturer Name of the product is : "+product.getManufacturerName());
    }
}

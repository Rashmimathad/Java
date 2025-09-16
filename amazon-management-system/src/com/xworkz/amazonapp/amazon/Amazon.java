package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.validator.ProductValidator;

public class Amazon {


    public  Amazon(int size){
        this.products=new Product[size];
    }
    public Product[] products;
    int index;

    public boolean addProduct(Product product){
        boolean isProductAdded=false;

        ProductValidator validateProduct = new ProductValidator();
        if (product!=null && validateProduct.validateProduct(product)){
            products[index++]=product;
            isProductAdded=true;
        }else System.out.println("Product not added!!!");

        return isProductAdded;
    }
//
//   public boolean updateProductPrice(int productId,double updatedPrice){
//        boolean isPriceUpdated=false;
//      if (updatedPrice>0){
//          for (Product product:products){
//              if (product.getProductId()==productId){
//                  product.setPrice(updatedPrice);
//                  isPriceUpdated=true;
//              }
//          }
//
//      }else System.out.println("Product price must be greater than Zero");
//
//      return isPriceUpdated;
//   }

//   public boolean deleteProduct(Product product){
//        boolean isProductDeleted=false;
//
//        this.product=null;
//        isProductDeleted=true;
//
//        return isProductDeleted;
//   }

    public boolean deleteProductById(int productId){
        boolean isProductDeleted=false;
        int length=products.length;
        for (int i = 0; i <products.length ; i++) {
            if (products[i].getProductId()==productId){
                for (int j=i;j<products.length-1;j++){
                    products[j]=products[j+1];
                }
                products[products.length-1]=null;
                length--;
                isProductDeleted=true;
                break;
            }
        }
        if (isProductDeleted!=false) System.out.println("The Product With Id "+productId+" is deleted");
        else System.out.println("Prouct with Id "+productId+" not found");
        return false;
    }


    public boolean updatePriceByProductId(int productId,double updatedPrice){
        boolean isPriceUpdated=false;
        if (updatedPrice>0.0) {
            for (Product product : products) {
                if (product.getProductId() == productId) {
                    product.setPrice(updatedPrice);
                    isPriceUpdated = true;
                }
            }
        } else System.out.println("Price cannot be updated to 0.0");
        if (isPriceUpdated!=false) System.out.println("The updated Price of product with Id "+productId+" is : "+updatedPrice);
        return isPriceUpdated;
    }

    public String getCategoryOfProductByProductId(int productId){
        for (Product product:products){
            if (product.getProductId()==productId){
                return "The category of profuct of the Id: "+productId+" is : "+product.getCategoryOfProduct();
            }
        }

        return  "Product Id "+productId+" not found";
    }

    public Product getProductInfoById(int productId){
        Product product=null;
        for (Product product1:products){
            if (product1.getProductId()==productId){
                product=product1;
            }
        }

        if (product!=null)return product;
        return null;
    }

    public void displayProductInfo(Product product){
        if (product!=null) {
            System.out.println("Product Id is : " + product.getProductId());
            System.out.println("Product Name is : " + product.getProductName());
            System.out.println("category of the product is : " + product.getCategoryOfProduct());
            System.out.println("Brand Name of the product is : " + product.getBrandName());
            System.out.println("Price of the product is : " + product.getPrice());
            System.out.println("Manufacturer Name of the product is : " + product.getManufacturerName());
            System.out.println("-------------------------------------------------------------------------------");
        }
    }

   public void getAllProductsDetails(){
       System.out.println("Products Info are : ");
       System.out.println();
        for (Product product : products) {
            if (product!=null) {
                System.out.println("Product Id is : " + product.getProductId());
                System.out.println("Product Name is : " + product.getProductName());
                System.out.println("category of the product is : " + product.getCategoryOfProduct());
                System.out.println("Brand Name of the product is : " + product.getBrandName());
                System.out.println("Price of the product is : " + product.getPrice());
                System.out.println("Manufacturer Name of the product is : " + product.getManufacturerName());
                System.out.println("-------------------------------------------------------------------------------");
            }
        }
    }
}

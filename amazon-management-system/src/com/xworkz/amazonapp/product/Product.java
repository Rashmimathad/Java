package com.xworkz.amazonapp.product;


import com.xworkz.amazonapp.constants.Availability;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int productId;
    private String productName;
    private String categoryOfProduct;
    private String brandName;
    private double price;
    private String manufacturerName;
    private Availability productAvailability;

    @Override
    public String toString(){
        return "Product = {productId= "+this.productId+", productName= "+this.productName+",categoryOfProduct= "+this.categoryOfProduct+", brandName= "+this.brandName+", price= "+this.price+", manufacturerName= "+this.manufacturerName+", productAvailability= "+this.productAvailability+"}";
    }

    @Override
    public  int hashCode(){
        return Objects.hash(productId,productName,categoryOfProduct,brandName,price,manufacturerName,productAvailability);
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Product){
            Product product=(Product) obj;
            if (this.productId==product.productId && this.productName.equals(product.productName) && this.categoryOfProduct.equals(product.categoryOfProduct) && this.brandName.equals(product.brandName) &&this.price==product.price && this.manufacturerName.equals(product.manufacturerName) && this.productAvailability.equals(product.productAvailability))
                return true;
            return false;
        }
        return false;
    }

//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public void setCategoryOfProduct(String categoryOfProduct) {
//        this.categoryOfProduct = categoryOfProduct;
//    }
//
//    public void setBrandName(String brandName) {
//        this.brandName = brandName;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setManufacturerName(String manufacturerName) {
//        this.manufacturerName = manufacturerName;
//    }
//
//    public int getProductId(){
//        return productId;
//    }
//
//    public String getProductName(){
//        return productName;
//    }
//
//    public String getCategoryOfProduct() {
//        return categoryOfProduct;
//    }
//
//    public String getBrandName() {
//        return brandName;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public String getManufacturerName() {
//        return manufacturerName;
//    }


}

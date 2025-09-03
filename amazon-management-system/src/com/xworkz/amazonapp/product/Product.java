package com.xworkz.amazonapp.product;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

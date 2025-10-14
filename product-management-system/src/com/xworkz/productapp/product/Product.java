package com.xworkz.productapp.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private int productId;
    private String productName;
    private double price;
    private String manufacturerName;
    private int quantity;
    private String expectedDeleveryDate;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", quantity=" + quantity +
                ", expectedDeleveryDate='" + expectedDeleveryDate + '\'' +
                '}';
    }
}

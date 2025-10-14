package com.xworkz.productapp;

import com.xworkz.productapp.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRunner {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        Product productOne = new Product(1, "Laptop", 79999.99, "Dell", 50, "2025-10-20");
        Product productTwo = new Product(2, "Smartphone", 49999.99, "Samsung", 100, "2025-10-25");
        Product productThree = new Product(3, "Smartwatch", 19999.99, "Apple", 200, "2025-11-01");
        Product productFour = new Product(4, "Headphones", 2999.99, "Sony", 150, "2025-11-05");
        Product productFive = new Product(5, "Tablet", 24999.99, "Lenovo", 75, "2025-11-10");
        Product productSix = new Product(6, "Smart TV", 59999.99, "LG", 30, "2025-11-15");
        Product productSeven = new Product(7, "Bluetooth Speaker", 2999.99, "JBL", 120, "2025-11-20");
        Product productEight = new Product(8, "Smart Home Assistant", 4999.99, "Amazon", 180, "2025-11-25");
        Product productNine = new Product(9, "Gaming Console", 39999.99, "PlayStation", 60, "2025-12-01");
        Product productTen = new Product(10, "Digital Camera", 34999.99, "Canon", 40, "2025-12-05");
        Product productEleven = new Product(11, "Smart Glasses", 14999.99, "Ray-Ban", 90, "2025-12-10");
        Product productTwelve = new Product(12, "Portable Charger", 999.99, "Anker", 250, "2025-12-15");
        Product productThirteen = new Product(13, "Wireless Mouse", 799.99, "Logitech", 300, "2025-12-20");
        Product productFourteen = new Product(14, "Mechanical Keyboard", 4999.99, "Corsair", 110, "2025-12-25");
        Product productFifteen = new Product(15, "External SSD", 7999.99, "Samsung", 130, "2026-01-01");
        Product productSixteen = new Product(16, "Smartphone Case", 499.99, "Spigen", 500, "2026-01-05");
        Product productSeventeen = new Product(17, "Screen Protector", 299.99, "ZAGG", 600, "2026-01-10");
        Product productEighteen = new Product(18, "Wireless Charger", 1999.99, "Belkin", 400, "2026-01-15");
        Product productNineteen = new Product(19, "Car Mount", 799.99, "iOttie", 350, "2026-01-20");
        Product productTwenty = new Product(20, "Smart Light Bulb", 999.99, "Philips", 450, "2026-01-25");

        products.add(productOne);
        products.add(productTwo);
        products.add(productThree);
        products.add(productFour);
        products.add(productFive);
        products.add(productSix);
        products.add(productSeven);
        products.add(productEight);
        products.add(productNine);
        products.add(productTen);
        products.add(productEleven);
        products.add(productTwelve);
        products.add(productThirteen);
        products.add(productFourteen);
        products.add(productFifteen);
        products.add(productSixteen);
        products.add(productSeventeen);
        products.add(productEighteen);
        products.add(productNineteen);
        products.add(productTwenty);

        System.out.println("Total products:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();

        List<Product> products1 = new ArrayList<>();
        Product productTwentyOne = new Product(21, "Smartphone", 54999.99, "OnePlus", 90, "2026-02-01");
        Product productTwentyTwo = new Product(22, "Laptop", 89999.99, "HP", 60, "2026-02-05");
        Product productTwentyThree = new Product(23, "Smartwatch", 21999.99, "Fitbit", 110, "2026-02-10");
        Product productTwentyFour = new Product(24, "Headphones", 3499.99, "Bose", 80, "2026-02-15");
        Product productTwentyFive = new Product(25, "Tablet", 26999.99, "Apple", 70, "2026-02-20");

        products1.add(productTwentyOne);
        products1.add(productTwentyTwo);
        products1.add(productTwentyThree);
        products1.add(productTwentyFour);
        products1.add(productTwentyFive);

        System.out.println("Total products of products1:");
        for (Product product : products1) {
            System.out.println(product);
        }
        System.out.println();

        System.out.println("Is products1 added to products: " + products.addAll(products1));
        System.out.println("Is products contains productSeven: " + products.contains(productSeven));
        System.out.println("Is products contains all products1: " + products.containsAll(products1));
        System.out.println();

        System.out.println("Total products:");
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("Is productTwentyOne removed: " + products.remove(productTwentyOne));
        System.out.println("Is products1 removed from products: " + products.removeAll(products1));
        System.out.println();
        System.out.println("Total products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

package com.xworkz.shopapp.impl;

import com.xworkz.shopapp.shop.Shop;

public class GroceryShopImpl implements Shop {
    @Override
    public void open() {
        System.out.println("Grocery Shop opened");
    }

    @Override
    public void sell() {
        System.out.println("Grocery Shop sell groceries");
    }

    @Override
    public void close() {
        System.out.println("Grocery Shop closed");
    }
}

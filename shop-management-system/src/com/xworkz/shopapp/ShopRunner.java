package com.xworkz.shopapp;

import com.xworkz.shopapp.impl.GroceryShopImpl;
import com.xworkz.shopapp.shop.Shop;

public class ShopRunner {
    public static void main(String[] args) {
        Shop shop=new GroceryShopImpl();
        shop.open();
        shop.sell();
        shop.close();
    }
}

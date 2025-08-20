package com.xworkz.shoppingmallapp;

import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.shoppingmall.ShoppingMall;

public class ShoppingMallRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Shop shopOne=new Shop();
        shopOne.setShopId(3);
        shopOne.setShopName("Zudio");
        shopOne.setShopType("Clothing");
        shopOne.setManagerName("Anita Sharma");
        shopOne.setNoOfStaffMembers(25);
        shopOne.setFloorNumber(2);

        ShoppingMall shoppingMall=new ShoppingMall();
        boolean isShopAdded=shoppingMall.addShop(shopOne);
        System.out.println("Is Shop Added? "+isShopAdded);

        if (isShopAdded)
            shoppingMall.getShopDetails();

        System.out.println("main ended");
    }
}

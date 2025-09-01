package com.xworkz.shoppingmallapp;

import com.xworkz.shoppingmallapp.orion.Orion;
import com.xworkz.shoppingmallapp.shoppingmall.ShoppingMall;

public class ShoppingMallRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        ShoppingMall shoppingMallOne=new Orion();
        shoppingMallOne.shoppingMall();
        System.out.println("main ended");
    }
}

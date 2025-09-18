package com.xworkz.restuarantapp;

import com.xworkz.restuarantapp.impl.FineDineRestaurantImpl;
import com.xworkz.restuarantapp.restaurant.Restaurant;

public class RestaurantRunner {
    public static void main(String[] args) {
        Restaurant restaurant=new FineDineRestaurantImpl();
        restaurant.takeOrder();
        restaurant.serveOrder();
        restaurant.generateBill();
    }
}

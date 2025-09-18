package com.xworkz.restuarantapp.impl;

import com.xworkz.restuarantapp.restaurant.Restaurant;

public class FineDineRestaurantImpl implements Restaurant {
    @Override
    public void takeOrder() {
        System.out.println("Fine Dine Restaurant takes order");
    }

    @Override
    public void serveOrder() {
        System.out.println("Fine Dine Restaurant serves the order");
    }

    @Override
    public void generateBill() {
        System.out.println("Fine Dine Restaurant generates Bill");
    }
}

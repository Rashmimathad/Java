package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.orders.Zomato;

public class ZomatoRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Zomato zomato = new Zomato();
        zomato.setFoodName("Masala Dosa");
        zomato.setQuantity(2);
        zomato.setPrice(120.00);
        zomato.setLocation("Mariappanapalya");

        System.out.println("Zomato order details : ");
        System.out.println("Food name is : "+zomato.getFoodName());
        System.out.println("Quantity of food is : "+zomato.getQuantity());
        System.out.println("Price of the ordered food is : "+zomato.getPrice());
        System.out.println("food delivery location is : "+zomato.getLocation());
        System.out.println("main ended");
    }
}

package com.xworkz.shoppingmallapp;

import com.xworkz.shoppingmallapp.shoppingmall.ShoppingMall;

public class ShoppingMallRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        ShoppingMall shoppingMall = new ShoppingMall();
        shoppingMall.setMallName("Orion Mall");
        shoppingMall.setLocation("Yelahanka");
        shoppingMall.setBuiltYear(2014);
        shoppingMall.setNoOfFloors(15);
        shoppingMall.setNoOfRetailShops(180);
        shoppingMall.setNoOfWorkers(250);
        shoppingMall.setNoOfFoodOutlets(120);
        shoppingMall.setMovieTheatre("PVR Cinemas");

        System.out.println("Shopping mall details : ");
        System.out.println("Mall name is : "+shoppingMall.getMallName());
        System.out.println("location of the mall is : "+shoppingMall.getLocation());
        System.out.println("Shopping mall is built in the year : "+shoppingMall.getBuiltYear());
        System.out.println("No of floors in the shopping mall : "+shoppingMall.getNoOfFloors());
        System.out.println("No of retail shops in the shopping mall are : "+shoppingMall.getNoOfRetailShops());
        System.out.println("No of workers of the shopping mall are : "+shoppingMall.getNoOfWorkers());
        System.out.println("No of food outlets in the shopping mall are : "+shoppingMall.getNoOfFoodOutlets());
        System.out.println("Movie theatre in the shopping mall is : "+shoppingMall.getMovieTheatre());
        System.out.println("main ended");
    }
}

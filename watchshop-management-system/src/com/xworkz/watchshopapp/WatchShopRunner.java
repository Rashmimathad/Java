package com.xworkz.watchshopapp;

import com.xworkz.watchshopapp.watch.Watch;
import com.xworkz.watchshopapp.watchshop.WatchShop;

public class WatchShopRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        Watch watchOne=new Watch();
        watchOne.setWatchId(1);
        watchOne.setBrandName("Fastrack");
        watchOne.setWatchType("Digital");
        watchOne.setMaterialType("Leather");
        watchOne.setPrice(1500.00);
        watchOne.setWaterResistant(true);

        WatchShop watchShop=new WatchShop();
        boolean isWatchAdded=watchShop.addWatch(watchOne);
        System.out.println("Is Watch Added? "+isWatchAdded);
        if (isWatchAdded)
            watchShop.getWatchDetails();

        System.out.println("main ended");
    }
}

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

        Watch watchTwo = new Watch();
        watchTwo.setWatchId(2);
        watchTwo.setBrandName("Titan");
        watchTwo.setWatchType("Analog");
        watchTwo.setMaterialType("Stainless Steel");
        watchTwo.setPrice(3500.00);
        watchTwo.setWaterResistant(true);

        Watch watchThree = new Watch();
        watchThree.setWatchId(3);
        watchThree.setBrandName("Sonata");
        watchThree.setWatchType("Analog");
        watchThree.setMaterialType("Plastic");
        watchThree.setPrice(900.00);
        watchThree.setWaterResistant(true);

        Watch watchFour = new Watch();
        watchFour.setWatchId(4);
        watchFour.setBrandName("Casio");
        watchFour.setWatchType("Digital");
        watchFour.setMaterialType("Resin");
        watchFour.setPrice(2500.00);
        watchFour.setWaterResistant(true);

        Watch watchFive = new Watch();
        watchFive.setWatchId(5);
        watchFive.setBrandName("Rolex");
        watchFive.setWatchType("Analog");
        watchFive.setMaterialType("Gold");
        watchFive.setPrice(500000.00);
        watchFive.setWaterResistant(true);

        Watch watchSix = new Watch();
        watchSix.setWatchId(6);
        watchSix.setBrandName("Timex");
        watchSix.setWatchType("Digital");
        watchSix.setMaterialType("Rubber");
        watchSix.setPrice(2200.00);
        watchSix.setWaterResistant(true);

        Watch watchSeven = new Watch();
        watchSeven.setWatchId(7);
        watchSeven.setBrandName("Seiko");
        watchSeven.setWatchType("Automatic");
        watchSeven.setMaterialType("Stainless Steel");
        watchSeven.setPrice(12000.00);
        watchSeven.setWaterResistant(true);

        Watch watchEight = new Watch();
        watchEight.setWatchId(8);
        watchEight.setBrandName("Omega");
        watchEight.setWatchType("Analog");
        watchEight.setMaterialType("Titanium");
        watchEight.setPrice(250000.00);
        watchEight.setWaterResistant(true);

        Watch watchNine = new Watch();
        watchNine.setWatchId(9);
        watchNine.setBrandName("Apple Watch");
        watchNine.setWatchType("Smartwatch");
        watchNine.setMaterialType("Aluminium");
        watchNine.setPrice(45000.00);
        watchNine.setWaterResistant(true);



        WatchShop watchShop=new WatchShop();

        System.out.println("Is Watch One Added? "+watchShop.addWatch(watchOne));
        System.out.println("Is Watch Two Added? "+watchShop.addWatch(watchTwo));
        System.out.println("Is Watch Three Added? "+watchShop.addWatch(watchThree));
        System.out.println("Is Watch Four Added? "+watchShop.addWatch(watchFour));
        System.out.println("Is Watch Five Added? "+watchShop.addWatch(watchFive));
        System.out.println("Is Watch Six Added? "+watchShop.addWatch(watchSix));
        System.out.println("Is Watch Seven Added? "+watchShop.addWatch(watchSeven));
        System.out.println("Is Watch Eight Added? "+watchShop.addWatch(watchEight));
        System.out.println("Is Watch Nine Added? "+watchShop.addWatch(watchNine));

        watchShop.getAllWatchDetails();

        System.out.println("main ended");
    }
}

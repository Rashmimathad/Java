package com.xworkz.bottleapp;

import com.xworkz.bottleapp.bottle.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Bottle bottle=new Bottle();
        bottle.setBottleId(1);
        bottle.setBrandName("Milton");
        bottle.setColor("Blue");
        bottle.setPrice(100.00);
        bottle.setIsTransparent(false);
        bottle.setMaterialType("Tupperware");

        System.out.println("Bottle Details : ");
        int bottleId = bottle.getBottleId();
        String brandName = bottle.getBrandName();
        String bottleColor = bottle.getColor();
        double bottlePrice = bottle.getPrice();
        boolean isTransparent = bottle.getIsTransparent();
        String materialType = bottle.getMaterialType();

        System.out.println("Bottle Id is : "+bottleId);
        System.out.println("Bottle brand name is : "+brandName);
        System.out.println("Bottle color is : "+bottleColor);
        System.out.println("Bottle price is : "+bottlePrice);
        System.out.println("Is Transparent bottle? "+isTransparent);
        System.out.println("Material type of bottle : "+materialType);
        System.out.println("main ended");
    }
}

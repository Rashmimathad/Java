package com.xworkz.watchshopapp.watchshop;

import com.xworkz.watchshopapp.validator.WatchValidator;
import com.xworkz.watchshopapp.watch.Watch;

public class WatchShop {
    Watch[] watches = new Watch[9];
    int index;
    public boolean addWatch(Watch watch){
        boolean isWatchAdded=false;

        WatchValidator validateWatch=new WatchValidator();
        if (watch!=null && validateWatch.validateWatch(watch)){
            watches[index++]=watch;
            isWatchAdded=true;
        }
        return isWatchAdded;
    }

    public void getAllWatchDetails(){
        System.out.println("All Watch details are :");
        System.out.println();
        for (Watch watch : watches) {
            System.out.println("Watch ID is : " + watch.getWatchId());
            System.out.println("Brand Name is : " + watch.getBrandName());
            System.out.println("Type of watch is : " + watch.getWatchType());
            System.out.println("Material type of watch is : " + watch.getMaterialType());
            System.out.println("Price of watch is : " + watch.getPrice());
            System.out.println("Is Water Resistant? " + watch.isWaterResistant());
            System.out.println("----------------------------------------------------------");
        }
    }
}

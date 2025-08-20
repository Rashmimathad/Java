package com.xworkz.watchshopapp.watchshop;

import com.xworkz.watchshopapp.validator.WatchValidator;
import com.xworkz.watchshopapp.watch.Watch;

public class WatchShop {
    Watch watch;

    public boolean addWatch(Watch watch){
        boolean isWatchAdded=false;

        WatchValidator validateWatch=new WatchValidator();
        boolean isWatchValidated=validateWatch.validateWatch(watch);
        if (isWatchValidated){
            this.watch=watch;
            isWatchAdded=true;
        }
        return isWatchAdded;
    }

    public void getWatchDetails(){
        System.out.println("Watch ID is : "+watch.getWatchId());
        System.out.println("Brand Name is : "+watch.getBrandName());
        System.out.println("Type of watch is : "+watch.getWatchType());
        System.out.println("Material type of watch is : "+watch.getMaterialType());
        System.out.println("Price of watch is : "+watch.getPrice());
        System.out.println("Is Water Resistant? "+watch.getWaterResistant());
    }
}

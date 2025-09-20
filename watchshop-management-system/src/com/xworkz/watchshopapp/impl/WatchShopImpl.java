package com.xworkz.watchshopapp.impl;

import com.xworkz.watchshopapp.validator.WatchValidator;
import com.xworkz.watchshopapp.watch.Watch;
import com.xworkz.watchshopapp.watchshop.WatchShop;

public class WatchShopImpl implements WatchShop {
    public WatchShopImpl(int size){
        this.watches=new Watch[size];
    }

    public Watch[] watches;
    int index;

    @Override
    public boolean addWatch(Watch watch){
        boolean isWatchAdded=false;

        WatchValidator validateWatch=new WatchValidator();
        if (watch!=null && validateWatch.validateWatch(watch)){
            watches[index++]=watch;
            isWatchAdded=true;
        }
        return isWatchAdded;
    }

    @Override
    public boolean updatePriceByWatchId(int watchId,double updatedPrice){
        boolean isPriceUpdated=false;
        for (Watch watch:watches){
            if (watch.getWatchId()==watchId){
                watch.setPrice(updatedPrice);
                isPriceUpdated=true;
            }
        }
        if (isPriceUpdated!=false) System.out.println("The updated price of watch with id "+watchId+" is : "+updatedPrice);
        else System.out.println("Price not updated for the watch Id "+watchId);

        return isPriceUpdated;
    }

    @Override
    public String getMaterialTypeByWatchId(int watchId){
        for (Watch watch:watches){
            if (watch.getWatchId()==watchId){
                return "The material type of watch with Id "+watchId+" is : "+watch.getMaterialType();
            }
        }
        return "watch with Id "+watchId+" not found";
    }

    @Override
    public String getBrandNameByWatchId(int watchId){
        for (Watch watch:watches){
            if (watch.getWatchId()==watchId){
                return "The Brand Name of watch with Id "+watchId+" is : "+watch.getBrandName();
            }
        }
        return "watch with Id "+watchId+" not found";
    }

    @Override
    public String getWatchTypeByWatchId(int watchId){
        for (Watch watch:watches){
            if (watch.getWatchId()==watchId){
                return "The type of watch with Id "+watchId+" is : "+watch.getWatchType();
            }
        }
        return "Watch with Id "+watchId+" not found";
    }

    @Override
    public double getPriceByWatchId(int watchId){
        double price = 0.0;
        for (Watch watch:watches){
            if (watch.getWatchId()==watchId){
                return watch.getPrice();
            }
        }
        return price;
    }
    
    @Override
    public boolean deleteWatchById(int watchId){
        boolean isWatchDeleted=false;
        int length=watches.length;

        for (int i = 0; i < watches.length; i++) {
            if (watches[i].getWatchId()==watchId){
                for (int j=i;j<watches.length-1;j++){
                    watches[j]=watches[j+1];
                }
                watches[watches.length-1]=null;
                length=length-1;
                isWatchDeleted=true;
                break;

            }
        }
        if (isWatchDeleted==false) System.out.println("Watch wih Id "+watchId+" not found");
        return isWatchDeleted;
    }

    @Override
    public Watch getWatchInfoById(int watchId){
        Watch watch=null;
        for (Watch watch1:watches){
            if (watch.getWatchId()==watchId){
                watch=watch1;
            }
        }
        if (watch!=null)return watch;
        return null;
    }

    @Override
    public void displayWatchInfo(Watch watch){
        if (watch!=null) {
            System.out.println("Watch ID is : " + watch.getWatchId());
            System.out.println("Brand Name is : " + watch.getBrandName());
            System.out.println("Type of watch is : " + watch.getWatchType());
            System.out.println("Material type of watch is : " + watch.getMaterialType());
            System.out.println("Price of watch is : " + watch.getPrice());
            System.out.println("Is Water Resistant? " + watch.isWaterResistant());
            System.out.println("----------------------------------------------------------");
        }
    }

    @Override
    public void getAllWatchDetails(){
        System.out.println("All Watch details are :");
        for (Watch watch : watches) {
            if (watch!=null) {
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
}

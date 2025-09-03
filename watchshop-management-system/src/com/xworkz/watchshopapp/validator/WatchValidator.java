package com.xworkz.watchshopapp.validator;

import com.xworkz.watchshopapp.watch.Watch;

public class WatchValidator {
    Watch watch;

    public boolean validateWatch(Watch watch){
        boolean isWatchValidated=false;
        boolean isWatchIdValid=false;
        boolean isBrandNameValid=false;
        boolean isWatchTypeValid=false;
        boolean isMaterialTypeValid=false;
        boolean isPriceValid=false;
        boolean isWaterResistantValid=false;

        if (watch.getWatchId()!=0)
            isWatchIdValid=true;
        else System.out.println("Invalid Watch Id");

        if (watch.getBrandName()!=null && !watch.getBrandName().isEmpty())
            isBrandNameValid=true;
        else System.out.println("Invalid brand name");

        if (watch.getWatchType()!=null && !watch.getWatchType().isEmpty())
            isWatchTypeValid=true;
        else System.out.println("Invalid watch type");

        if (watch.getMaterialType()!=null && !watch.getMaterialType().isEmpty())
            isMaterialTypeValid=true;
        else System.out.println("Invalid material type");

        if (watch.getPrice()!=0.0 )
            isPriceValid=true;
        else System.out.println("Invalid price");

        if (watch.isWaterResistant()!=false)
            isWaterResistantValid=true;
        else System.out.println("Invalid detail");

        if (isWatchIdValid && isBrandNameValid && isWatchTypeValid && isMaterialTypeValid && isPriceValid && isWaterResistantValid){
            isWatchValidated=true;
        }

        return isWatchValidated;
    }
}

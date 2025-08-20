package com.xworkz.amusementparkapp;

import com.xworkz.amusementparkapp.amusementpark.AmusementPark;

public class AmusementParkRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        AmusementPark amusementPark=new AmusementPark();
        amusementPark.setParkId(1);
        amusementPark.setName("Wonderla");
        amusementPark.setLocation("Bengaluru");
        amusementPark.setOpeningTime("10:00 AM");
        amusementPark.setClosingTime("6:00 PM");
        amusementPark.setEntryFee(850.00);

        System.out.println("Amusement park details : ");
        int parkId = amusementPark.getParkId();
        String parkName = amusementPark.getName();
        String parkLocation = amusementPark.getLocation();
        String openingTime = amusementPark.getOpeningTime();
        String closingTime = amusementPark.getClosingTime();
        double entryFee = amusementPark.getEntryFee();

        System.out.println("Amusement Park Id is : "+parkId);
        System.out.println("Amusement Park Name is : "+parkName);
        System.out.println("Amusement Park is located at : "+parkLocation);
        System.out.println("Opening time of amusement park is : "+openingTime);
        System.out.println("Closing time of amusement park is : "+closingTime);
        System.out.println("Entry fee of the amusement park is : "+entryFee);

        System.out.println("main ended");
    }
}

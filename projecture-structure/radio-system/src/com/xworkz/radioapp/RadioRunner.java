package com.xworkz.radioapp;

import com.xworkz.radioapp.radio.Radio;

public class RadioRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Radio radio = new Radio();
        radio.setBatteryLife("21 to 25 hrs");
        radio.setWeightInGrams(680);
        radio.setCustomerRating(4.3);
        radio.setIsWaterProof(true);
        radio.setVoltageLevel(120);
        radio.setRadioType("AM/FM");

        System.out.println("Radio details : ");
        String batteryLife = radio.getBatteryLife();
        int weightInGrams = radio.getWeightInGrams();
        double customerRatings = radio.getCustomerRating();
        boolean isWaterProof = radio.getIsWaterProof();
        int voltageLevel = radio.getVoltageLevel();
        String radioType = radio.getRadioType();

        System.out.println("Battery life of the radio is : "+batteryLife);
        System.out.println("Weight of the radio is : "+weightInGrams+" g");
        System.out.println("customer ratings for the radio is :"+customerRatings);
        System.out.println("Is radio water proof? "+isWaterProof);
        System.out.println("voltage level of the radio is : "+voltageLevel+" V");
        System.out.println("Radio type is : "+radioType);
        System.out.println("main ended");
    }
}

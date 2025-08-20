package com.xworkz.radioapp.radio;

public class Radio {
    private String batteryLife;
    private int weightInGrams;
    private double customerRating;
    private boolean isWaterProof;
    private int voltageLevel;
    private String radioType;

    public String getBatteryLife(){
        return batteryLife;
    }

    public int getWeightInGrams(){
        return weightInGrams;
    }

    public double getCustomerRating(){
        return customerRating;
    }

    public boolean getIsWaterProof(){
        return isWaterProof;
    }

    public int getVoltageLevel(){
        return voltageLevel;
    }

    public String getRadioType(){
        return radioType;
    }

    public void setBatteryLife(String batteryLife){
        this.batteryLife=batteryLife;
    }

    public  void  setWeightInGrams(int weightInGrams){
        this.weightInGrams=weightInGrams;
    }

    public void setCustomerRating(double customerRating){
        this.customerRating=customerRating;
    }

    public void setIsWaterProof(boolean isWaterProof){
        this.isWaterProof=isWaterProof;
    }

    public void setVoltageLevel(int voltageLevel){
        this.voltageLevel=voltageLevel;
    }

    public void setRadioType(String radioType){
        this.radioType=radioType;
    }
}

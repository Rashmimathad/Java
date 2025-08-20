package com.xworkz.pharmacyapp.pharmacy;

public class Pharmacy {
    private int pharmacyId;
    private String pharmacyName;
    private String ownerName;
    private String location;
    private double netProfit;

    public int getPharmacyId(){
        return pharmacyId;
    }

    public String getPharmacyName(){
        return pharmacyName;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public String getLocation(){
        return location;
    }

    public double getNetProfit(){
        return netProfit;
    }

    public void setPharmacyId(int pharmacyId){
        this.pharmacyId=pharmacyId;
    }

    public void setPharmacyName(String pharmacyName){
        this.pharmacyName=pharmacyName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }

    public void setLocation(String location){
        this.location=location;
    }

    public void setNetProfit(double netProfit){
        this.netProfit=netProfit;
    }


}

package com.xworkz.policestationapp.policestation;

public class PoliceStation {
    private int stationId;
    private String stationName;
    private String location;
    private long contactNumber;
    private String email;
    private String stationType;
    private String jurisdictionArea;

    public int getStationId(){
        return  stationId;
    }

    public String getStationName(){
        return stationName;
    }

    public String getLocation(){
        return  location;
    }

    public long getContactNumber(){
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getStationType(){
        return stationType;
    }

    public String getJurisdictionArea(){
        return jurisdictionArea;
    }

    public void setStationId(int stationId){
        this.stationId=stationId;
    }

    public void setStationName(String stationName){
        this.stationName=stationName;
    }

    public void setLocation(String location){
        this.location=location;
    }

    public void setContactNumber(long contactNumber){
        this.contactNumber=contactNumber;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setStationType(String stationType){
        this.stationType=stationType;
    }

    public void setJurisdictionArea(String jurisdictionArea) {
        this.jurisdictionArea = jurisdictionArea;
    }
}

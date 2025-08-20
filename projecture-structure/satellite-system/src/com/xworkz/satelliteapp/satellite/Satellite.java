package com.xworkz.satelliteapp.satellite;

import java.sql.Struct;

public class Satellite {
    private int satelliteId;
    private String name;
    private String launchDate;
    private String orbitType;
    private String launchVehicle;
    private String launchSite;
    private String missionType;

    public int getSatelliteId(){
        return satelliteId;
    }

    public String getName(){
        return name;
    }

    public String getLaunchDate(){
        return launchDate;
    }

    public String getOrbitType(){
        return orbitType;
    }

    public String getLaunchVehicle(){
        return launchVehicle;
    }

    public String getLaunchSite(){
        return launchSite;
    }

    public String getMissionType(){
        return missionType;
    }

    public void setSatelliteId(int satelliteId){
        this.satelliteId=satelliteId;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setLaunchDate(String launchDate){
        this.launchDate=launchDate;
    }

    public void setOrbitType(String orbitType){
        this.orbitType=orbitType;
    }

    public void setLaunchVehicle(String launchVehicle){
        this.launchVehicle=launchVehicle;
    }

    public void setLaunchSite(String launchSite){
        this.launchSite=launchSite;
    }

    public void setMissionType(String missionType){
        this.missionType=missionType;
    }
}

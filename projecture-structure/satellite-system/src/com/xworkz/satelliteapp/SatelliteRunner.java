package com.xworkz.satelliteapp;

import com.xworkz.satelliteapp.satellite.Satellite;

public class SatelliteRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Satellite satellite = new Satellite();
        satellite.setSatelliteId(1);
        satellite.setName("GSAT-30");
        satellite.setLaunchDate("17-01-2020");
        satellite.setOrbitType("Geostationary");
        satellite.setLaunchVehicle("Ariane 5");
        satellite.setLaunchSite("Kourou");
        satellite.setMissionType("Communications");

        System.out.println("Satellite details : ");
        int satelliteId = satellite.getSatelliteId();
        String satelliteName = satellite.getName();
        String launchDate = satellite.getLaunchDate();
        String orbitType = satellite.getOrbitType();
        String launchVehicle = satellite.getLaunchVehicle();
        String launchSite = satellite.getLaunchSite();
        String missionType = satellite.getMissionType();

        System.out.println("Id of satellite is : "+satelliteId);
        System.out.println("Name of the satellite is : "+satelliteName);
        System.out.println("Launch date of the satellite is : "+launchDate);
        System.out.println("Orbit type of the satellite is : "+orbitType);
        System.out.println("Launch vehicle of the satellite is : "+launchVehicle);
        System.out.println("Launch site of the satellite is : "+launchSite);
        System.out.println("Mission type of the satellite is : "+missionType);
        System.out.println("main ended");
    }
}

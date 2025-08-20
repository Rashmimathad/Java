package com.xworkz.policestationapp;

import com.xworkz.policestationapp.policestation.PoliceStation;

public class PoliceStationRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        PoliceStation policeStation = new PoliceStation();
        policeStation.setStationId(111);
        policeStation.setStationName("MG Road Police Station");
        policeStation.setLocation("MG Road,Bangalore");
        policeStation.setContactNumber(8023456789L);
        policeStation.setEmail("mgps@ksp.gov.in");
        policeStation.setStationType("Urban");
        policeStation.setJurisdictionArea("5 Km radius");

        System.out.println("Police station details : ");
        int stationId = policeStation.getStationId();
        String stationName = policeStation.getStationName();
        String location = policeStation.getLocation();
        long contactNumber = policeStation.getContactNumber();
        String email = policeStation.getEmail();
        String stationType = policeStation.getStationType();
        String jurisdictionArea = policeStation.getJurisdictionArea();

        System.out.println("Police Station Id is : "+stationId);
        System.out.println("Police station name is : "+stationName);
        System.out.println("location of the police station is : "+location);
        System.out.println("contact number of the police station is : "+contactNumber);
        System.out.println("email id of the police station is : "+email);
        System.out.println("type of the police station is : "+stationType);
        System.out.println("Jurisdiction area of the policae station is : "+jurisdictionArea);
        System.out.println("main ended");
    }
}

package com.xworkz.policestationapp;

import com.xworkz.policestationapp.police.Police;
import com.xworkz.policestationapp.policestation.PoliceStation;

public class PoliceStationRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println();

        Police policeOne = new Police();
        policeOne.setPoliceId(111);
        policeOne.setPoliceName("Meena Deshpande");
        policeOne.setDesignation("IPS Officer");
        policeOne.setStationName("Karnataka State Reserve Police");
        policeOne.setYearsOfService(15);
        policeOne.setOnDuty(true);

        PoliceStation policeStation = new PoliceStation();
        boolean isPoliceAdded= policeStation.addPolice(policeOne);
        System.out.println("Is police added? "+isPoliceAdded);

        if (isPoliceAdded)
            policeStation.getPoliceDetails();;


        System.out.println();
        System.out.println("main ended");
    }
}

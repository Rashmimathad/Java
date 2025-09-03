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

        Police policeTwo = new Police();
        policeTwo.setPoliceId(112);
        policeTwo.setPoliceName("Rajesh Kumar");
        policeTwo.setDesignation("Sub-Inspector");
        policeTwo.setStationName("Bangalore Central Police Station");
        policeTwo.setYearsOfService(8);
        policeTwo.setOnDuty(true);

        Police policeThree = new Police();
        policeThree.setPoliceId(113);
        policeThree.setPoliceName("Anita Shetty");
        policeThree.setDesignation("Deputy Commissioner");
        policeThree.setStationName("Mangalore City Police");
        policeThree.setYearsOfService(20);
        policeThree.setOnDuty(true);

        Police policeFour = new Police();
        policeFour.setPoliceId(114);
        policeFour.setPoliceName("Vikram Patil");
        policeFour.setDesignation("Inspector");
        policeFour.setStationName("Hubli Rural Police Station");
        policeFour.setYearsOfService(12);
        policeFour.setOnDuty(true);

        Police policeFive = new Police();
        policeFive.setPoliceId(115);
        policeFive.setPoliceName("Suma Reddy");
        policeFive.setDesignation("Assistant Sub-Inspector");
        policeFive.setStationName("Mysore South Police Station");
        policeFive.setYearsOfService(10);
        policeFive.setOnDuty(true);

        Police policeSix = new Police();
        policeSix.setPoliceId(116);
        policeSix.setPoliceName("Raghav Gowda");
        policeSix.setDesignation("Head Constable");
        policeSix.setStationName("Belgaum City Police");
        policeSix.setYearsOfService(18);
        policeSix.setOnDuty(true);

        PoliceStation policeStation = new PoliceStation();
        System.out.println("Is police One added? "+policeStation.addPolice(policeOne));
        System.out.println("Is police Two added? "+policeStation.addPolice(policeTwo));
        System.out.println("Is police Three added? "+policeStation.addPolice(policeThree));
        System.out.println("Is police Four added? "+policeStation.addPolice(policeFour));
        System.out.println("Is police Five added? "+policeStation.addPolice(policeFive));
        System.out.println("Is police Six added? "+policeStation.addPolice(policeSix));

        System.out.println();
        policeStation.getAllPolicesDetails();;


        System.out.println();
        System.out.println("main ended");
    }
}

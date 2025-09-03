package com.xworkz.policestationapp.policestation;

import com.xworkz.policestationapp.police.Police;
import com.xworkz.policestationapp.validator.PoliceValidator;

public class PoliceStation {
    Police[] polices = new Police[6];
    int index;
    public boolean addPolice(Police police){
        boolean isPoliceAdded=false;

        PoliceValidator validatePolice = new PoliceValidator();

        if (police!=null && validatePolice.validatePoliceInfo(police)){
            polices[index++]=police;
            isPoliceAdded=true;
        }
        return isPoliceAdded;
    }

    public void getAllPolicesDetails(){
        System.out.println("All Polices Details are :");
        System.out.println();
        for (Police police : polices) {
            System.out.println("Police Id is : " + police.getPoliceId());
            System.out.println("Police Name is : " + police.getPoliceName());
            System.out.println("Designation of the police is : " + police.getDesignation());
            System.out.println("Station name of the police working is : " + police.getStationName());
            System.out.println("Years of service of the police is  : " + police.getYearsOfService());
            System.out.println("Is On Duty? " + police.isOnDuty());
            System.out.println("-----------------------------------------------------------------------");
        }
    }
}

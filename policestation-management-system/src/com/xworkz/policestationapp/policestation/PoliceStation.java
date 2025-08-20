package com.xworkz.policestationapp.policestation;

import com.xworkz.policestationapp.police.Police;
import com.xworkz.policestationapp.validator.PoliceValidator;

public class PoliceStation {
    Police police;

    public boolean addPolice(Police police){
        boolean isPoliceAdded=false;

        PoliceValidator validatePolice = new PoliceValidator();
        boolean isPoliceValidated = validatePolice.validatePoliceInfo(police);

        if (isPoliceValidated){
            this.police=police;
            isPoliceAdded=true;
        }
        return isPoliceAdded;
    }

    public void getPoliceDetails(){
        System.out.println("Police Id is : "+police.getPoliceId());
        System.out.println("Police Name is : "+police.getPoliceName());
        System.out.println("Designation of the police is : "+police.getDesignation());
        System.out.println("Station name of the police working is : "+police.getStationName());
        System.out.println("Years of service of the police is  : "+police.getYearsOfService());
        System.out.println("Is On Duty? "+police.getIsOnDuty());
    }
}

package com.xworkz.policestationapp.validator;

import com.xworkz.policestationapp.police.Police;

public class PoliceValidator {
    Police police;

    public boolean validatePoliceInfo(Police police){
        boolean isPoliceValidated=false;
        boolean isPoliceIdValid=false;
        boolean isPoliceNameValid=false;
        boolean isDesignationValid=false;
        boolean isStationNameValid=false;
        boolean isYearsOfServiceValid=false;
        boolean isOnDutyValid=false;

        if (police.getPoliceId()!=0)
            isPoliceIdValid=true;
        else System.out.println("Invalid police Id");

        if (police.getPoliceName()!=null && !police.getPoliceName().isEmpty())
            isPoliceNameValid=true;
        else System.out.println("Invalid Police Name");

        if (police.getDesignation()!=null && !police.getDesignation().isEmpty())
            isDesignationValid=true;
        else System.out.println("Invalid designation");

        if (police.getStationName()!=null && !police.getStationName().isEmpty())
            isStationNameValid=true;
        else System.out.println("Invalid station Name");

        if (police.getYearsOfService()!=0)
            isYearsOfServiceValid=true;
        else System.out.println("Invalid years of service");

        if (police.getIsOnDuty() != false)
            isOnDutyValid=true;
        else System.out.println("Invalid details");

        if (isPoliceIdValid && isPoliceNameValid && isDesignationValid && isStationNameValid && isYearsOfServiceValid && isOnDutyValid){
            isPoliceValidated=true;
        }
        return isPoliceValidated;
    }
}

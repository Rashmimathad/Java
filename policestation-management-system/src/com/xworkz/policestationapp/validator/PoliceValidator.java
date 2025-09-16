package com.xworkz.policestationapp.validator;

import com.xworkz.policestationapp.police.Police;

public class PoliceValidator {

    public boolean validatePoliceInfo(Police police){
        boolean isPoliceValidated=false;
        boolean isPoliceIdValid=false;
        boolean isPoliceNameValid=false;
        boolean isDesignationValid=false;
        boolean isYearsOfServiceValid=false;
        boolean isOnDutyValid=false;
        boolean isDepartmentValid=false;

        if (police.getPoliceId()!=0)
            isPoliceIdValid=true;
        else System.out.println("Invalid police Id");

        if (police.getPoliceName()!=null && !police.getPoliceName().isEmpty())
            isPoliceNameValid=true;
        else System.out.println("Invalid Police Name");

        if (police.getDesignation()!=null && !police.getDesignation().isEmpty())
            isDesignationValid=true;
        else System.out.println("Invalid designation");


        if (police.getYearsOfService()!=0)
            isYearsOfServiceValid=true;
        else System.out.println("Invalid years of service");

        if (police.isOnDuty() != false)
            isOnDutyValid=true;
        else System.out.println("Invalid details");

        if (police.getDepartment()!=null) isDepartmentValid=true;
        else System.out.println("Invalid Department");

        if (isPoliceIdValid && isPoliceNameValid && isDesignationValid && isYearsOfServiceValid && isOnDutyValid && isDepartmentValid){
            isPoliceValidated=true;
        }
        return isPoliceValidated;
    }
}

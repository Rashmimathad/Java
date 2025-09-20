package com.xworkz.loksabhaapp.validator;

import com.xworkz.loksabhaapp.politician.Politician;

public class PoliticianValidator {

    public boolean validatePolitician(Politician politician){
        boolean isPoliticianValidated=false;
        boolean isPoliticianIdValid=false;
        boolean isPoliticianNameValid=false;
        boolean isDesignationValid=false;
        boolean isConstituencyNameValid=false;
        boolean isAgeValid=false;
        boolean isYearsInServiceValid=false;
        boolean isPoliticalPartyValid=false;

        if (politician.getPoliticianId()!=0)
            isPoliticianIdValid=true;
        else System.out.println("Invalid politician Id");

        if (politician.getPoliticianName()!=null && !politician.getPoliticianName().isEmpty())
            isPoliticianNameValid=true;
        else System.out.println("Invalid Politician name");

        if (politician.getDesignation()!=null && !politician.getDesignation().isEmpty())
            isDesignationValid=true;
        else System.out.println("Invalid Designation");

        if (politician.getConstituencyName()!=null && !politician.getConstituencyName().isEmpty())
            isConstituencyNameValid=true;
        else System.out.println("Invalid constituency name");

        if (politician.getAge()!=0)
            isAgeValid=true;
        else System.out.println("Invalid Age");

        if (politician.getYearsInService()!=0)
            isYearsInServiceValid=true;
        else System.out.println("Invalid years in service");

        if (politician.getPoliticalParty()!=null) isPoliticalPartyValid=true;
        else System.out.println("Invalid political party");

        if (isPoliticianIdValid && isPoliticianNameValid && isDesignationValid && isConstituencyNameValid && isAgeValid && isYearsInServiceValid && isPoliticalPartyValid){
            isPoliticianValidated=true;
        }
        return isPoliticianValidated;

    }
}

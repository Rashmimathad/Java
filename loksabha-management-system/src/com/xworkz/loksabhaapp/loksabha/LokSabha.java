package com.xworkz.loksabhaapp.loksabha;

import com.xworkz.loksabhaapp.politician.Politician;
import com.xworkz.loksabhaapp.validator.PoliticianValidator;

public class LokSabha {
    Politician politician;

    public boolean addPolitician(Politician politician){
        boolean isPoliticianAdded=false;

        PoliticianValidator politicianValidator=new PoliticianValidator();
        boolean isPoliticianValidated=politicianValidator.validatePolitician(politician);
        if (isPoliticianValidated){
            this.politician=politician;
            isPoliticianAdded=true;
        }
        return isPoliticianAdded;
    }

    public void getPoliticianDetails(){
        System.out.println("Politician Id is : "+politician.getPoliticianId());
        System.out.println("Politician Name is : "+politician.getPoliticianName());
        System.out.println("Designation of politician is : "+politician.getDesignation());
        System.out.println("Constituency of the politician is : "+politician.getConstituencyName());
        System.out.println("Age of the politician is : "+politician.getAge()+" years");
        System.out.println("Years in Service of politician is : "+politician.getYearsInService()+" years");
    }
}

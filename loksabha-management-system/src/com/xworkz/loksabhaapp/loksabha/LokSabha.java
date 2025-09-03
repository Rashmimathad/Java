package com.xworkz.loksabhaapp.loksabha;

import com.xworkz.loksabhaapp.politician.Politician;
import com.xworkz.loksabhaapp.validator.PoliticianValidator;

public class LokSabha {
    Politician[] politicians = new Politician[12];
    int index;

    public boolean addPolitician(Politician politician){
        boolean isPoliticianAdded=false;

        PoliticianValidator politicianValidator=new PoliticianValidator();
        if (politician!=null && politicianValidator.validatePolitician(politician)){
            politicians[index++]=politician;
            isPoliticianAdded=true;
        }
        return isPoliticianAdded;
    }

    public void getAllPoliticiansDetails(){
        System.out.println("All Politicians Details are :");
        System.out.println();
        for (Politician politician : politicians) {
            System.out.println("Politician Id is : " + politician.getPoliticianId());
            System.out.println("Politician Name is : " + politician.getPoliticianName());
            System.out.println("Designation of politician is : " + politician.getDesignation());
            System.out.println("Constituency of the politician is : " + politician.getConstituencyName());
            System.out.println("Age of the politician is : " + politician.getAge() + " years");
            System.out.println("Years in Service of politician is : " + politician.getYearsInService() + " years");
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }
}

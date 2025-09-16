package com.xworkz.loksabhaapp.loksabha;

import com.xworkz.loksabhaapp.constants.PoliticalParty;
import com.xworkz.loksabhaapp.politician.Politician;
import com.xworkz.loksabhaapp.validator.PoliticianValidator;

public class LokSabha {

    public LokSabha(int size){
        this.politicians=new Politician[size];
    }

    public Politician[] politicians;
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


    public String getPoliticianNameBYId(int politicianId){
        for (Politician politician:politicians){
            if (politician.getPoliticianId()==politicianId){
                return "The politician name of the Id "+politicianId+" is : "+politician.getPoliticianName();
            }
        }
        return "Politician with Id "+politicianId+" not found";
    }

    public String getConstituencyNameByPoliticianName(String politicianName){
        for (Politician politician: politicians){
            if (politician.getPoliticianName().equalsIgnoreCase(politicianName)){
                return "The constituency name of the politician "+politicianName+" is : "+politician.getConstituencyName();
            }
        }

        return "Politician "+politicianName+" not found";
    }

    public String getPoliticalPartyByPoliticianName(String politicianName){
        for (Politician politician: politicians){
            if (politician.getPoliticianName().equalsIgnoreCase(politicianName)){
                return "The Political party of the "+politicianName+" is : "+politician.getPoliticalParty();
            }
        }
        return "Politician "+politicianName+" not found";
    }

    public String getDesignationByPoliticianName(String politicianName){
        for (Politician politician: politicians){
            if (politician.getPoliticianName().equalsIgnoreCase(politicianName)){
                return "The designation of the politician "+politicianName+" is : "+politician.getDesignation();
            }
        }

        return "Politician "+politicianName+" not found";
    }

    public boolean updatePoliticalPartyById(int politicianId, PoliticalParty updatedPoliticalParty){
        boolean isPoliticalPartyUpadated=false;
        for (Politician politician:politicians){
            if (politician.getPoliticianId()==politicianId){
                politician.setPoliticalParty(updatedPoliticalParty);
                isPoliticalPartyUpadated=true;
            }
        }

        if (isPoliticalPartyUpadated!=false) System.out.println("The updated political party of the politician with Id "+politicianId+" is : "+updatedPoliticalParty);
        else System.out.println("Politician with Id "+politicianId+" not found!!");
        return isPoliticalPartyUpadated;
    }

    public String getDesignationById(int politicianId){
        for (Politician politician: politicians){
            if (politician.getPoliticianId()==politicianId){
                return "The designation of the politician "+politicianId+" is : "+politician.getDesignation();
            }
        }

        return "Politician with Id "+politicianId +" not found";
    }

    public boolean deletePoliticianById(int politicianId){
        boolean isPatientDeleted=false;
        int length=politicians.length;
        for (int i=0;i<politicians.length;i++){
            if (politicians[i].getPoliticianId()==politicianId){
                for (int j=i;j<politicians.length;j++){
                    politicians[j]=politicians[j++];
                }
                politicians[politicians.length-1]=null;
                length--;
                isPatientDeleted=true;
                break;
            }
        }
        if (isPatientDeleted!=false) System.out.println("Politician with Id "+politicianId+" is deleted");
        else System.out.println("Politician with Id "+politicianId+" not found");
        return isPatientDeleted;
    }

    public Politician getPolitcianInfoById(int politicianId){
        Politician politician1=null;
        for (Politician politician:politicians){
            if (politician.getPoliticianId()==politicianId){
                politician1= politician;
            }
        }
        return politician1;
    }

    public void getPoliticianInfo(Politician politician){
     if (politician!=null){
             System.out.println("Politician Id is : " + politician.getPoliticianId());
             System.out.println("Politician Name is : " + politician.getPoliticianName());
             System.out.println("Designation of politician is : " + politician.getDesignation());
             System.out.println("Constituency of the politician is : " + politician.getConstituencyName());
             System.out.println("Age of the politician is : " + politician.getAge() + " years");
             System.out.println("Years in Service of politician is : " + politician.getYearsInService() + " years");
             System.out.println("Political party of the politician is : "+politician.getPoliticalParty());
             System.out.println("--------------------------------------------------------------------------------------");
         }
    }

    public void getAllPoliticiansDetails(){
        System.out.println("All Politicians Details are :");
        System.out.println();
        for (Politician politician : politicians) {
            if (politician != null) {
                System.out.println("Politician Id is : " + politician.getPoliticianId());
                System.out.println("Politician Name is : " + politician.getPoliticianName());
                System.out.println("Designation of politician is : " + politician.getDesignation());
                System.out.println("Constituency of the politician is : " + politician.getConstituencyName());
                System.out.println("Age of the politician is : " + politician.getAge() + " years");
                System.out.println("Years in Service of politician is : " + politician.getYearsInService() + " years");
                System.out.println("Political party of the politician is : " + politician.getPoliticalParty());
                System.out.println("--------------------------------------------------------------------------------------");
            }
        }
    }

}

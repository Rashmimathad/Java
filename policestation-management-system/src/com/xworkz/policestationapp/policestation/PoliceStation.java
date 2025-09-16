package com.xworkz.policestationapp.policestation;

import com.xworkz.policestationapp.police.Police;
import com.xworkz.policestationapp.validator.PoliceValidator;

public class PoliceStation {

    public PoliceStation(int size){
        this.policeOfficers=new Police[size];
    }

    public Police[] policeOfficers;
    int index;

    public boolean addPolice(Police police){
        boolean isPoliceAdded=false;

        PoliceValidator validatePolice = new PoliceValidator();

        if (police!=null && validatePolice.validatePoliceInfo(police)){
            policeOfficers[index++]=police;
            isPoliceAdded=true;
        }
        return isPoliceAdded;
    }

    public String getPoliceNameById(int policeId){
        for (Police police: policeOfficers){
            if (police.getPoliceId()==policeId){
                return "The name of the police with Id "+policeId+" is : "+police.getPoliceName();
            }
        }
        return "The Police with Id "+policeId+" not found";
    }

    public String getDesignationByPoliceName(String policeName){
        for (Police police:policeOfficers){
            if (police.getPoliceName().equalsIgnoreCase(policeName)){
                return "The Designation of the police "+policeName+" is : "+police.getDesignation();
            }
        }
        return "Police "+policeName+" not found";
    }

    public String getDepartmentByPoliceName(String policeName){

        for (Police police:policeOfficers){
            if (police.getPoliceName().equalsIgnoreCase(policeName)){
                return "The Department of police "+police+" working is : "+police.getDepartment();
            }
        }
        return "Police "+policeName+" not found";
    }

    public String getYearsOfServiceById(int policeId){
        for (Police police:policeOfficers){
            if (police.getPoliceId()==policeId){
                return "The years of service of police with Id "+policeId+" is : "+police.getYearsOfService()+" years";
            }
        }
        return "Police with Id "+policeId+" not found";
    }

    public String getDesignationById(int policeId){
        for (Police police:policeOfficers){
            if (police.getPoliceId()==policeId){
                return "The Designation of the police with Id "+policeId+" is : "+police.getDesignation();
            }
        }
        return "Police with Id"+policeId+" not found";
    }

    public boolean deletePoliceById(int policeId){
        boolean isPoliceDeleted=false;
        int length=policeOfficers.length;
        for (int i = 0; i < policeOfficers.length; i++) {
            if (policeOfficers[i].getPoliceId()==policeId){
                for(int j=i;j<policeOfficers.length-1;j++){
                    policeOfficers[j]=policeOfficers[j+1];
                }
                policeOfficers[policeOfficers.length-1]=null;
                length--;
                isPoliceDeleted=true;
                break;
            }
        }
        if (isPoliceDeleted) System.out.println("The Police with Id "+policeId+" is Deleted");
        return false;
    }

    public Police getPoliceInfoById(int policeId){
        Police police=null;
        for (Police officer:policeOfficers){
            if (officer.getPoliceId()==policeId){
                police=officer;
            }
        }
        if (police!=null) return police;
        return null;
    }

    public boolean updateDesignationById(int policeId,String updatedDesignation){
        boolean isDesignationUpdated=false;
        for (Police police:policeOfficers){
            if (police.getPoliceId()==policeId){
                police.setDesignation(updatedDesignation);
                isDesignationUpdated=true;
            }
        }

        if (isDesignationUpdated!=false) System.out.println("The updated designation of police with Id "+policeId+" is : "+updatedDesignation);
        else System.out.println("Police with Id "+policeId+" not found!!");
        return isDesignationUpdated;
    }

    public void displayPoliceInfo(Police police){
        if (police!=null) {
            System.out.println("Police Id is : " + police.getPoliceId());
            System.out.println("Police Name is : " + police.getPoliceName());
            System.out.println("Designation of the police is : " + police.getDesignation());
            System.out.println("Years of service of the police is  : " + police.getYearsOfService());
            System.out.println("Is On Duty? " + police.isOnDuty());
            System.out.println("Department of police officer working : " + police.getDepartment());
            System.out.println("-----------------------------------------------------------------------");
        }else System.out.println("Police not found!!");
    }

    public void getAllPolicesDetails(){
        System.out.println("All Polices Details are :");
        System.out.println();
        for (Police police : policeOfficers) {
            if (police!=null) {
                System.out.println("Police Id is : " + police.getPoliceId());
                System.out.println("Police Name is : " + police.getPoliceName());
                System.out.println("Designation of the police is : " + police.getDesignation());
                System.out.println("Years of service of the police is  : " + police.getYearsOfService());
                System.out.println("Is On Duty? " + police.isOnDuty());
                System.out.println("Department of police officer working : " + police.getDepartment());
                System.out.println("-----------------------------------------------------------------------");
            }
        }
    }
}

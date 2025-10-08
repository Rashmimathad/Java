package com.xworkz.policestationapp.police;

import com.xworkz.policestationapp.constants.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Police {

    private int policeId;
    private String policeName;
    private String designation;
    private int yearsOfService;
    private boolean isOnDuty;
    private Department department;

    @Override
    public String toString() {
        return "Police = {policeId= "+this.policeId+", policeName= "+this.policeName+", designation= " +this.designation+
                ", yearsOfService= "+this.yearsOfService+", isOnDuty= " +this.isOnDuty+", department= "+this.department+"}";
    }

    @Override
    public  int hashCode(){
        return Objects.hash(policeId,policeName,designation,department,yearsOfService,isOnDuty);
    }

    @Override
    public  boolean equals(Object obj){
        if (obj instanceof Police){
            Police police=(Police) obj;
            if (this.policeId==police.policeId&& this.policeName.equals(police.policeName)&& this.designation.equals(police.designation)&&this.yearsOfService==police.yearsOfService&& this.isOnDuty==police.isOnDuty&& this.department.equals(police.department))
                return true;
            return false;
        }
        return false;
    }


    //    public void setPoliceId(int policeId){
//        this.policeId=policeId;
//    }
//
//    public void setPoliceName(String policeName){
//        this.policeName=policeName;
//    }
//
//    public void setDesignation(String designation){
//        this.designation=designation;
//    }
//
//    public void setStationName(String stationName){
//        this.stationName=stationName;
//    }
//
//    public void setYearsOfService(int yearsOfService){
//        this.yearsOfService=yearsOfService;
//    }
//
//    public void setOnDuty(boolean isOnDuty){
//        this.isOnDuty=isOnDuty;
//    }
//
//    public int getPoliceId(){
//        return policeId;
//    }
//
//    public String getPoliceName(){
//        return policeName;
//    }
//
//    public String getDesignation(){
//        return designation;
//    }
//
//    public String getStationName(){
//        return stationName;
//    }
//
//    public int getYearsOfService(){
//        return yearsOfService;
//    }
//
//    public boolean getIsOnDuty(){
//        return isOnDuty;
//    }
}

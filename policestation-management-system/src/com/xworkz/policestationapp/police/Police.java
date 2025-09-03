package com.xworkz.policestationapp.police;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Police {

    private int policeId;
    private String policeName;
    private String designation;
    private String stationName;
    private int yearsOfService;
    private boolean isOnDuty;

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

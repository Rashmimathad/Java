package com.xworkz.courtapp.court;

public class Court{
     private String courtName;
     private String location;
     private int  establishedYear;
     private int  noOfJudges;
     private String chiefJusticeName;
     private int noOfBenches;

     public String getCourtName(){
          return courtName;
     }

     public String getLocation(){
          return location;
     }

     public int getEstablishedYear(){
          return establishedYear;
     }

     public int getNoOfJudges(){
          return noOfJudges;
     }

     public String getChiefJusticeName(){
          return chiefJusticeName;
     }

     public int getNoOfBenches(){
          return noOfBenches;
     }

     public void setCourtName(String courtName){
          this.courtName=courtName;
     }

     public void setLocation(String location){
          this.location=location;
     }

     public void setEstablishedYear(int establishedYear){
          this.establishedYear=establishedYear;
     }

     public void setNoOfJudges(int noOfJudges){
          this.noOfJudges=noOfJudges;
     }

     public void setChiefJusticeName(String chiefJusticeName){
          this.chiefJusticeName=chiefJusticeName;
     }

     public void setNoOfBenches(int noOfBenches){
          this.noOfBenches=noOfBenches;
     }
}

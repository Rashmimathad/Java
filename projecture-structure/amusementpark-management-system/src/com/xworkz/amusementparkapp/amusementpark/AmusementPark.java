package com.xworkz.amusementparkapp.amusementpark;

public class AmusementPark {
   private int parkId;
   private String name;
   private String location;
   private String openingTime;
   private String closingTime;
   private double entryFee;

   public int getParkId(){
       return parkId;
   }

   public String getName(){
       return name;
   }

   public String getLocation(){
       return location;
   }

   public  String getOpeningTime(){
       return openingTime;
   }

   public String getClosingTime(){
       return closingTime;
   }

   public double getEntryFee(){
       return entryFee;
   }

   public void setParkId(int parkId){
       this.parkId=parkId;
   }

   public void setName(String name){
       this.name=name;
   }

   public void setLocation(String location){
       this.location=location;
   }

   public  void setOpeningTime(String openingTime){
       this.openingTime=openingTime;
   }

   public void setClosingTime(String closingTime){
       this.closingTime=closingTime;
   }

   public void setEntryFee(double entryFee){
       this.entryFee=entryFee;
   }


}

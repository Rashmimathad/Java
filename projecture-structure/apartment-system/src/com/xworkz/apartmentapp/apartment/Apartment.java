package com.xworkz.apartmentapp.apartment;

public class Apartment {
   private  String apartmentName;
   private String location;
   private  int noOfFloors;
   private int noOfFlats;
   private String flatTypes;
   private boolean isElevatorAvailable;

   public String getApartmentName(){
       return apartmentName;
   }

   public String getLocation(){
       return location;
   }

   public int getNoOfFloors(){
       return noOfFloors;
   }

   public int getNoOfFlats(){
       return noOfFlats;
   }

   public String getFlatTypes(){

       return flatTypes;
   }

   public boolean getIsElevatorAvailable(){
       return isElevatorAvailable;
   }

   public void setApartmentName(String apartmentName){
       this.apartmentName=apartmentName;
   }

   public void  setLocation(String location){
       this.location=location;
   }

   public void setNoOfFloors(int noOfFloors){
       this.noOfFloors=noOfFloors;
   }

   public void setNoOfFlats(int noOfFlats){
       this.noOfFlats=noOfFlats;
   }

   public void setFlatTypes(String flatTypes){
       this.flatTypes=flatTypes;
   }

   public void setIsElevatorAvailable(boolean isElevatorAvailable){
       this.isElevatorAvailable=isElevatorAvailable;
   }
}

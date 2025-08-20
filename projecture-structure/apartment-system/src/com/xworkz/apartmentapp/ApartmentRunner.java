package com.xworkz.apartmentapp;

import com.xworkz.apartmentapp.apartment.Apartment;

public class ApartmentRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Apartment apartment=new Apartment();
        apartment.setApartmentName("Brigade Gateway");
        apartment.setLocation("Sampige Road");
        apartment.setNoOfFloors(10);
        apartment.setNoOfFlats(300);
        apartment.setFlatTypes("3BHK");
        apartment.setIsElevatorAvailable(true);

        System.out.println("Apartment details : ");
        String apartmentName = apartment.getApartmentName();
        String location = apartment.getLocation();
        int noOfFloors = apartment.getNoOfFloors();
        int noOfFats = apartment.getNoOfFlats();
        String flatTypes = apartment.getFlatTypes();
        boolean isElevatorAvailable = apartment.getIsElevatorAvailable();

        System.out.println("Apartment Name is : "+apartmentName);
        System.out.println("Apartment is located at : "+location);
        System.out.println("No of floors in apartment are : "+noOfFloors);
        System.out.println("No of flats in the apartment are : "+noOfFats);
        System.out.println("The type of flat of apartment are : "+flatTypes);
        System.out.println("Is ELevator Available? "+isElevatorAvailable);
        System.out.println("main ended");
    }
}
                    
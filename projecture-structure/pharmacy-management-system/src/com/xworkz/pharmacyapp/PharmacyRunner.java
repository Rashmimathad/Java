package com.xworkz.pharmacyapp;

import com.xworkz.pharmacyapp.pharmacy.Pharmacy;

public class PharmacyRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.setPharmacyId(101);
        pharmacy.setPharmacyName("Apollo Pharmacy");
        pharmacy.setOwnerName("Prakash");
        pharmacy.setLocation("RajaiNagar,Bengaluru");
        pharmacy.setNetProfit(50000.00);

        System.out.println("Pharmacy Details : ");
        int pharmacyId = pharmacy.getPharmacyId();
        String pharmacyName = pharmacy.getPharmacyName();
        String ownerName = pharmacy.getOwnerName();
        String location = pharmacy.getLocation();
        double netProfit = pharmacy.getNetProfit();

        System.out.println("Id of pharmacy is : "+pharmacyId);
        System.out.println("Pharmacy name is : "+pharmacyName);
        System.out.println("owner of the pharmacy is : "+ownerName);
        System.out.println("Pharmacy is located at : "+location);
        System.out.println("Net profit of the pharmacy is : "+netProfit);
        System.out.println("main ended");
    }
}

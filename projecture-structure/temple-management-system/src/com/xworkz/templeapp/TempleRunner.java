package com.xworkz.templeapp;

import com.xworkz.templeapp.temple.Temple;

public class TempleRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Temple temple = new Temple();
        temple.setTempleName("Tirupati");
        temple.setLocation("Tirumala");
        temple.setDeity("Lord Venkateshwara");
        temple.setNoOfSteps(3550);
        temple.setFestivalsOrganized("SriVaari Brahmotsavam");
        temple.setManagementAuthority("Tirumala Tirupati Devasthanams(TTD)");
        temple.setEstablishedYear(300);

        System.out.println("Temple Details : ");
        System.out.println("Temple name is : "+temple.getTempleName());
        System.out.println("Temple is located at : "+temple.getLocation());
        System.out.println("Diety of the temple is : "+temple.getDeity());
        System.out.println("no of steps at the temple are : "+temple.getNoOfSteps());
        System.out.println("Festival organized in temple : "+temple.getFestivalsOrganized());
        System.out.println("management authority of the temple is : "+temple.getManagementAuthority());
        System.out.println("temple is established in the year : "+temple.getEstablishedYear()+" CE");
        System.out.println("main ended");
    }
}

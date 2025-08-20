package com.xworkz.courtapp;

import com.xworkz.courtapp.court.Court;

public class CourtRunner{
    public static void main(String[] args) {
        System.out.println("main started");

        Court court = new Court();
        court.setCourtName("High Court");
        court.setLocation("Bengaluru, Karntaka");
        court.setEstablishedYear(1988);
        court.setNoOfJudges(15);
        court.setChiefJusticeName("Valluri Kameswar Rao");
        court.setNoOfBenches(100);

        System.out.println("Court Details : ");
        String courtName = court.getCourtName();
        String courtLocation = court.getLocation();
        int establishedYear = court.getEstablishedYear();
        int noOfJudges = court.getNoOfJudges();
        String chiefJusticeName = court.getChiefJusticeName();
        int noOfBenches = court.getNoOfBenches();

        System.out.println("Court name is : "+courtName);
        System.out.println("Location of court is : "+courtLocation);
        System.out.println("Established year of the court is : "+establishedYear);
        System.out.println("No of judges in the court are : "+noOfJudges);
        System.out.println("Chief justice name of the court is : "+chiefJusticeName);
        System.out.println("No of benches in the court are : "+noOfBenches);

        System.out.println("main ended");
    }
}

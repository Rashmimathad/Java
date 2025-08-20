package com.xworkz.loksabhaapp;

import com.xworkz.loksabhaapp.loksabha.LokSabha;
import com.xworkz.loksabhaapp.politician.Politician;

public class LokSabhaRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Politician politicianOne=new Politician();
        politicianOne.setPoliticianId(1011);
        politicianOne.setPoliticianName("Narendra Modi");
        politicianOne.setDesignation("Prime Minister");
        politicianOne.setConstituencyName("Varanasi");
        politicianOne.setAge(73);
        politicianOne.setYearsInService(22);

        LokSabha lokSabha=new LokSabha();
        boolean isPoliticianAdded=lokSabha.addPolitician(politicianOne);
        if (isPoliticianAdded)
            lokSabha.getPoliticianDetails();

        System.out.println("main ended");
    }
}

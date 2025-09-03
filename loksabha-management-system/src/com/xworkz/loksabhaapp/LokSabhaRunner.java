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

        Politician politicianTwo = new Politician();
        politicianTwo.setPoliticianId(1012);
        politicianTwo.setPoliticianName("Amit Shah");
        politicianTwo.setDesignation("Home Minister");
        politicianTwo.setConstituencyName("Gandhinagar");
        politicianTwo.setAge(60);
        politicianTwo.setYearsInService(30);

        Politician politicianThree = new Politician();
        politicianThree.setPoliticianId(1013);
        politicianThree.setPoliticianName("Rahul Gandhi");
        politicianThree.setDesignation("Member of Parliament");
        politicianThree.setConstituencyName("Wayanad");
        politicianThree.setAge(54);
        politicianThree.setYearsInService(20);

        Politician politicianFour = new Politician();
        politicianFour.setPoliticianId(1014);
        politicianFour.setPoliticianName("Sonia Gandhi");
        politicianFour.setDesignation("Former Congress President");
        politicianFour.setConstituencyName("Rae Bareli");
        politicianFour.setAge(77);
        politicianFour.setYearsInService(25);

        Politician politicianFive = new Politician();
        politicianFive.setPoliticianId(1015);
        politicianFive.setPoliticianName("Mamata Banerjee");
        politicianFive.setDesignation("Chief Minister");
        politicianFive.setConstituencyName("Bhabanipur");
        politicianFive.setAge(69);
        politicianFive.setYearsInService(40);

        Politician politicianSix = new Politician();
        politicianSix.setPoliticianId(1016);
        politicianSix.setPoliticianName("Arvind Kejriwal");
        politicianSix.setDesignation("Chief Minister");
        politicianSix.setConstituencyName("New Delhi");
        politicianSix.setAge(56);
        politicianSix.setYearsInService(18);

        Politician politicianSeven = new Politician();
        politicianSeven.setPoliticianId(1017);
        politicianSeven.setPoliticianName("Nirmala Sitharaman");
        politicianSeven.setDesignation("Finance Minister");
        politicianSeven.setConstituencyName("Karnataka Rajya Sabha");
        politicianSeven.setAge(64);
        politicianSeven.setYearsInService(17);

        Politician politicianEight = new Politician();
        politicianEight.setPoliticianId(1018);
        politicianEight.setPoliticianName("Sharad Pawar");
        politicianEight.setDesignation("NCP Leader");
        politicianEight.setConstituencyName("Baramati");
        politicianEight.setAge(83);
        politicianEight.setYearsInService(55);

        Politician politicianNine = new Politician();
        politicianNine.setPoliticianId(1019);
        politicianNine.setPoliticianName("Yogi Adityanath");
        politicianNine.setDesignation("Chief Minister");
        politicianNine.setConstituencyName("Gorakhpur");
        politicianNine.setAge(52);
        politicianNine.setYearsInService(25);

        Politician politicianTen = new Politician();
        politicianTen.setPoliticianId(1020);
        politicianTen.setPoliticianName("Pinarayi Vijayan");
        politicianTen.setDesignation("Chief Minister");
        politicianTen.setConstituencyName("Dharmadam");
        politicianTen.setAge(79);
        politicianTen.setYearsInService(50);

        Politician politicianEleven = new Politician();
        politicianEleven.setPoliticianId(1021);
        politicianEleven.setPoliticianName("MK Stalin");
        politicianEleven.setDesignation("Chief Minister");
        politicianEleven.setConstituencyName("Kolathur");
        politicianEleven.setAge(72);
        politicianEleven.setYearsInService(40);

        Politician politicianTwelve = new Politician();
        politicianTwelve.setPoliticianId(1022);
        politicianTwelve.setPoliticianName("Shashi Tharoor");
        politicianTwelve.setDesignation("Member of Parliament");
        politicianTwelve.setConstituencyName("Thiruvananthapuram");
        politicianTwelve.setAge(68);
        politicianTwelve.setYearsInService(15);

        LokSabha lokSabha=new LokSabha();
        System.out.println("Is Politician One added? : "+lokSabha.addPolitician(politicianOne));
        System.out.println("Is Politician Two added? : "+lokSabha.addPolitician(politicianTwo));
        System.out.println("Is Politician Three added? : "+lokSabha.addPolitician(politicianThree));
        System.out.println("Is Politician Four added? : "+lokSabha.addPolitician(politicianFour));
        System.out.println("Is Politician Five added? : "+lokSabha.addPolitician(politicianFive));
        System.out.println("Is Politician Six added? : "+lokSabha.addPolitician(politicianSix));
        System.out.println("Is Politician Seven added? : "+lokSabha.addPolitician(politicianSeven));
        System.out.println("Is Politician Eight added? : "+lokSabha.addPolitician(politicianEight));
        System.out.println("Is Politician Nine added? : "+lokSabha.addPolitician(politicianNine));
        System.out.println("Is Politician Ten added? : "+lokSabha.addPolitician(politicianTen));
        System.out.println("Is Politician Eleven added? : "+lokSabha.addPolitician(politicianEleven));
        System.out.println("Is Politician Twelve added? : "+lokSabha.addPolitician(politicianTwelve));

        System.out.println();
        lokSabha.getAllPoliticiansDetails();

        System.out.println("main ended");
    }
}

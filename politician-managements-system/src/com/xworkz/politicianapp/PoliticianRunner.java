package com.xworkz.politicianapp;

import com.xworkz.politicianapp.politician.Politician;

import java.util.ArrayList;
import java.util.List;

public class PoliticianRunner {

    public static void main(String[] args) {

        List<Politician> politicians = new ArrayList<>();

        Politician politicianOne = new Politician(1, "Narendra Modi", 73, "Prime Minister", "Varanasi", "BJP");
        Politician politicianTwo = new Politician(2, "Rahul Gandhi", 55, "Member of Parliament", "Wayanad", "INC");
        Politician politicianThree = new Politician(3, "Amit Shah", 59, "Home Minister", "Gandhinagar", "BJP");
        Politician politicianFour = new Politician(4, "Sonia Gandhi", 79, "Former Congress President", "Raebareli", "INC");
        Politician politicianFive = new Politician(5, "Arvind Kejriwal", 56, "Chief Minister", "New Delhi", "AAP");
        Politician politicianSix = new Politician(6, "Mamata Banerjee", 71, "Chief Minister", "Nandigram", "TMC");
        Politician politicianSeven = new Politician(7, "Yogi Adityanath", 51, "Chief Minister", "Gorakhpur", "BJP");
        Politician politicianEight = new Politician(8, "Nitish Kumar", 73, "Chief Minister", "Nalanda", "JD(U)");
        Politician politicianNine = new Politician(9, "M. K. Stalin", 71, "Chief Minister", "Chennai", "DMK");
        Politician politicianTen = new Politician(10, "Tejashwi Yadav", 35, "Deputy Chief Minister", "RJD", "Bihar");
        Politician politicianEleven = new Politician(11, "Sharad Pawar", 84, "NCP President", "Baramati", "NCP");
        Politician politicianTwelve = new Politician(12, "Droupadi Murmu", 66, "President of India", "Mayurbhanj", "BJP");
        Politician politicianThirteen = new Politician(13, "Prakash Javadekar", 68, "Former Union Minister", "Maharashtra", "BJP");
        Politician politicianFourteen = new Politician(14, "Smriti Irani", 48, "Union Minister", "Amethi", "BJP");
        Politician politicianFifteen = new Politician(15, "Sushma Swaraj", 67, "Former External Affairs Minister", "Haryana", "BJP");
        Politician politicianSixteen = new Politician(16, "Rajiv Gandhi", 46, "Former Prime Minister", "New Delhi", "INC");
        Politician politicianSeventeen = new Politician(17, "Indira Gandhi", 66, "Former Prime Minister", "New Delhi", "INC");
        Politician politicianEighteen = new Politician(18, "Atal Bihari Vajpayee", 93, "Former Prime Minister", "Gwalior", "BJP");
        Politician politicianNineteen = new Politician(19, "Manmohan Singh", 92, "Former Prime Minister", "Gurgaon", "INC");
        Politician politicianTwenty = new Politician(20, "Sharad Yadav", 75, "Former Union Minister", "Bihar", "JD(U)");

        politicians.add(politicianOne);
        politicians.add(politicianTwo);
        politicians.add(politicianThree);
        politicians.add(politicianFour);
        politicians.add(politicianFive);
        politicians.add(politicianSix);
        politicians.add(politicianSeven);
        politicians.add(politicianEight);
        politicians.add(politicianNine);
        politicians.add(politicianTen);
        politicians.add(politicianEleven);
        politicians.add(politicianTwelve);
        politicians.add(politicianThirteen);
        politicians.add(politicianFourteen);
        politicians.add(politicianFifteen);
        politicians.add(politicianSixteen);
        politicians.add(politicianSeventeen);
        politicians.add(politicianEighteen);
        politicians.add(politicianNineteen);
        politicians.add(politicianTwenty);

        System.out.println("Total politicians:");
        for (Politician politician : politicians) {
            System.out.println(politician);
        }
        System.out.println();

        List<Politician> politicians1 = new ArrayList<>();
        Politician politicianTwentyOne = new Politician(21, "Jyotiraditya Scindia", 53, "Union Minister", "Guna", "BJP");
        Politician politicianTwentyTwo = new Politician(22, "Tejasvi Surya", 33, "MP", "Bangalore South", "BJP");
        Politician politicianTwentyThree = new Politician(23, "Priyanka Gandhi Vadra", 53, "General Secretary", "Rae Bareli", "INC");
        Politician politicianTwentyFour = new Politician(24, "Sanjay Raut", 63, "Rajya Sabha MP", "Maharashtra", "Shiv Sena");
        Politician politicianTwentyFive = new Politician(25, "K. Chandrashekar Rao", 70, "Chief Minister", "Gajwel", "BRS");

        politicians1.add(politicianTwentyOne);
        politicians1.add(politicianTwentyTwo);
        politicians1.add(politicianTwentyThree);
        politicians1.add(politicianTwentyFour);
        politicians1.add(politicianTwentyFive);

        System.out.println("Total politicians of politicians1:");
        for (Politician politician : politicians1) {
            System.out.println(politician);
        }
        System.out.println();

        System.out.println("Is politicians1 added to politicians: " + politicians.addAll(politicians1));
        System.out.println("Is politicians contains politicianSeven: " + politicians.contains(politicianSeven));
        System.out.println("Is politicians contains all politicians1: " + politicians.containsAll(politicians1));
        System.out.println();

        System.out.println("Total politicians:");
        for (Politician politician : politicians) {
            System.out.println(politician);
        }

        System.out.println();
        System.out.println("Is politicianTwentyOne removed: " + politicians.remove(politicianTwentyOne));
        System.out.println("Is politicians1 removed from politicians: " + politicians.removeAll(politicians1));
        System.out.println();
        System.out.println("Total politicians:");
        for (Politician politician : politicians) {
            System.out.println(politician);
        }
    }
}

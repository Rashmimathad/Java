package com.xworkz.policeapp;

import com.xworkz.policeapp.police.Police;

import java.util.ArrayList;
import java.util.List;

public class PoliceRunner {

    public static void main(String[] args) {

        List<Police> policeList = new ArrayList<>();

        Police policeOne = new Police(1, "Rajesh Kumar", "Inspector", "Connaught Place", 35, 10);
        Police policeTwo = new Police(2, "Suresh Yadav", "Sub-Inspector", "Karol Bagh", 40, 12);
        Police policeThree = new Police(3, "Anjali Verma", "Assistant Sub-Inspector", "Saket", 30, 8);
        Police policeFour = new Police(4, "Vikram Singh", "Head Constable", "Dwarka", 45, 15);
        Police policeFive = new Police(5, "Priya Sharma", "Constable", "Vasant Vihar", 28, 5);
        Police policeSix = new Police(6, "Manoj Gupta", "Inspector", "Rohini", 38, 11);
        Police policeSeven = new Police(7, "Neha Patel", "Sub-Inspector", "Pitampura", 32, 9);
        Police policeEight = new Police(8, "Amit Kumar", "Assistant Sub-Inspector", "Janakpuri", 36, 10);
        Police policeNine = new Police(9, "Sunita Devi", "Head Constable", "Lajpat Nagar", 42, 14);
        Police policeTen = new Police(10, "Ravi Singh", "Constable", "Shahdara", 29, 6);
        Police policeEleven = new Police(11, "Kiran Rani", "Inspector", "Narela", 37, 13);
        Police policeTwelve = new Police(12, "Deepak Mehta", "Sub-Inspector", "Moti Nagar", 41, 12);
        Police policeThirteen = new Police(13, "Sneha Joshi", "Assistant Sub-Inspector", "Kalkaji", 33, 9);
        Police policeFourteen = new Police(14, "Rakesh Kumar", "Head Constable", "Okhla", 44, 16);
        Police policeFifteen = new Police(15, "Pooja Soni", "Constable", "Sarai Rohilla", 27, 4);
        Police policeSixteen = new Police(16, "Harish Chandra", "Inspector", "Civil Lines", 39, 11);
        Police policeSeventeen = new Police(17, "Geeta Rani", "Sub-Inspector", "Kashmere Gate", 34, 10);
        Police policeEighteen = new Police(18, "Suraj Kumar", "Assistant Sub-Inspector", "Burari", 43, 15);
        Police policeNineteen = new Police(19, "Rekha Yadav", "Head Constable", "Kashmiri Gate", 46, 17);
        Police policeTwenty = new Police(20, "Vandana Sharma", "Constable", "Sarai Kale Khan", 26, 3);

        policeList.add(policeOne);
        policeList.add(policeTwo);
        policeList.add(policeThree);
        policeList.add(policeFour);
        policeList.add(policeFive);
        policeList.add(policeSix);
        policeList.add(policeSeven);
        policeList.add(policeEight);
        policeList.add(policeNine);
        policeList.add(policeTen);
        policeList.add(policeEleven);
        policeList.add(policeTwelve);
        policeList.add(policeThirteen);
        policeList.add(policeFourteen);
        policeList.add(policeFifteen);
        policeList.add(policeSixteen);
        policeList.add(policeSeventeen);
        policeList.add(policeEighteen);
        policeList.add(policeNineteen);
        policeList.add(policeTwenty);

        System.out.println("Total police officers:");
        for (Police police : policeList) {
            System.out.println(police);
        }
        System.out.println();

        List<Police> additionalPoliceList = new ArrayList<>();
        Police policeTwentyOne = new Police(21, "Amit Chauhan", "Inspector", "Mundka", 48, 18);
        Police policeTwentyTwo = new Police(22, "Neelam Rani", "Sub-Inspector", "Najafgarh", 50, 19);
        Police policeTwentyThree = new Police(23, "Kunal Mehta", "Assistant Sub-Inspector", "Sarai Rohilla", 52, 20);
        Police policeTwentyFour = new Police(24, "Suman Verma", "Head Constable", "Sadar Bazar", 54, 21);
        Police policeTwentyFive = new Police(25, "Ravindra Singh", "Constable", "Chandni Chowk", 56, 22);

        additionalPoliceList.add(policeTwentyOne);
        additionalPoliceList.add(policeTwentyTwo);
        additionalPoliceList.add(policeTwentyThree);
        additionalPoliceList.add(policeTwentyFour);
        additionalPoliceList.add(policeTwentyFive);

        System.out.println("Total additional police officers:");
        for (Police police : additionalPoliceList) {
            System.out.println(police);
        }
        System.out.println();

        System.out.println("Is additionalPoliceList added to policeList: " + policeList.addAll(additionalPoliceList));
        System.out.println("Is policeList contains policeSeven: " + policeList.contains(policeSeven));
        System.out.println("Is policeList contains all additionalPoliceList: " + policeList.containsAll(additionalPoliceList));
        System.out.println();

        System.out.println("Total police officers:");
        for (Police police : policeList) {
            System.out.println(police);
        }

        System.out.println();
        System.out.println("Is policeTwentyOne removed: " + policeList.remove(policeTwentyOne));
        System.out.println("Is additionalPoliceList removed from policeList: " + policeList.removeAll(additionalPoliceList));
        System.out.println();
        System.out.println("Total police officers:");
        for (Police police : policeList) {
            System.out.println(police);
        }
    }
}

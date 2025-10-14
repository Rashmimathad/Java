package com.xworkz.instituteapp;

import com.xworkz.instituteapp.institute.Institute;

import java.util.ArrayList;
import java.util.List;

public class InstituteRunner {

    public static void main(String[] args) {

        List<Institute> institutes = new ArrayList<>();

        Institute instituteOne = new Institute(1, "Tech Academy", "Delhi", 300, 5, 10);
        Institute instituteTwo = new Institute(2, "Design School", "Mumbai", 200, 4, 8);
        Institute instituteThree = new Institute(3, "Business Institute", "Bangalore", 150, 3, 6);
        Institute instituteFour = new Institute(4, "Coding Bootcamp", "Chennai", 100, 2, 4);
        Institute instituteFive = new Institute(5, "Language Center", "Hyderabad", 50, 1, 2);
        Institute instituteSix = new Institute(6, "Music Academy", "Pune", 80, 2, 3);
        Institute instituteSeven = new Institute(7, "Art School", "Kolkata", 60, 2, 3);
        Institute instituteEight = new Institute(8, "Culinary Institute", "Lucknow", 40, 1, 2);
        Institute instituteNine = new Institute(9, "Photography School", "Ahmedabad", 30, 1, 2);
        Institute instituteTen = new Institute(10, "Dance Academy", "Jaipur", 70, 2, 4);
        Institute instituteEleven = new Institute(11, "Yoga Center", "Surat", 90, 3, 5);
        Institute instituteTwelve = new Institute(12, "Driving School", "Vadodara", 120, 3, 6);
        Institute instituteThirteen = new Institute(13, "Fashion Institute", "Nagpur", 110, 3, 6);
        Institute instituteFourteen = new Institute(14, "Film School", "Indore", 130, 4, 7);
        Institute instituteFifteen = new Institute(15, "Photography School", "Bhopal", 140, 4, 7);
        Institute instituteSixteen = new Institute(16, "Coding Bootcamp", "Patna", 150, 5, 8);
        Institute instituteSeventeen = new Institute(17, "Design School", "Ranchi", 160, 5, 8);
        Institute instituteEighteen = new Institute(18, "Business Institute", "Agra", 170, 6, 9);
        Institute instituteNineteen = new Institute(19, "Language Center", "Udaipur", 180, 6, 9);
        Institute instituteTwenty = new Institute(20, "Music Academy", "Patiala", 190, 6, 10);

        institutes.add(instituteOne);
        institutes.add(instituteTwo);
        institutes.add(instituteThree);
        institutes.add(instituteFour);
        institutes.add(instituteFive);
        institutes.add(instituteSix);
        institutes.add(instituteSeven);
        institutes.add(instituteEight);
        institutes.add(instituteNine);
        institutes.add(instituteTen);
        institutes.add(instituteEleven);
        institutes.add(instituteTwelve);
        institutes.add(instituteThirteen);
        institutes.add(instituteFourteen);
        institutes.add(instituteFifteen);
        institutes.add(instituteSixteen);
        institutes.add(instituteSeventeen);
        institutes.add(instituteEighteen);
        institutes.add(instituteNineteen);
        institutes.add(instituteTwenty);

        System.out.println("Total institutes:");
        for (Institute institute : institutes) {
            System.out.println(institute);
        }
        System.out.println();

        List<Institute> institutes1 = new ArrayList<>();
        Institute instituteTwentyOne = new Institute(21, "Art School", "Chandigarh", 50, 1, 2);
        Institute instituteTwentyTwo = new Institute(22, "Culinary Institute", "Gurgaon", 60, 2, 3);
        Institute instituteTwentyThree = new Institute(23, "Photography School", "Noida", 70, 2, 4);
        Institute instituteTwentyFour = new Institute(24, "Dance Academy", "Faridabad", 80, 2, 4);
        Institute instituteTwentyFive = new Institute(25, "Yoga Center", "Ghaziabad", 90, 3, 5);

        institutes1.add(instituteTwentyOne);
        institutes1.add(instituteTwentyTwo);
        institutes1.add(instituteTwentyThree);
        institutes1.add(instituteTwentyFour);
        institutes1.add(instituteTwentyFive);

        System.out.println("Total institutes of institutes1:");
        for (Institute institute : institutes1) {
            System.out.println(institute);
        }
        System.out.println();

        System.out.println("Is institutes1 added to institutes: " + institutes.addAll(institutes1));
        System.out.println("Is institutes contains instituteSeven: " + institutes.contains(instituteSeven));
        System.out.println("Is institutes contains all institutes1: " + institutes.containsAll(institutes1));
        System.out.println();

        System.out.println("Total institutes:");
        for (Institute institute : institutes) {
            System.out.println(institute);
        }

        System.out.println();
        System.out.println("Is instituteTwentyOne removed: " + institutes.remove(instituteTwentyOne));
        System.out.println("Is institutes1 removed from institutes: " + institutes.removeAll(institutes1));
        System.out.println();
        System.out.println("Total institutes:");
        for (Institute institute : institutes) {
            System.out.println(institute);
        }
    }
}

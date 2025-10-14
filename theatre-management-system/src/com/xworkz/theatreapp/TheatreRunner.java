package com.xworkz.theatreapp;

import com.xworkz.theatreapp.theatre.Theatre;

import java.util.ArrayList;
import java.util.List;

public class TheatreRunner {

    public static void main(String[] args) {

        List<Theatre> theatres = new ArrayList<>();

        Theatre theatreOne = new Theatre(1, "PVR Cinemas", "Connaught Place", 5, 1000, "Ajay Sharma");
        Theatre theatreTwo = new Theatre(2, "INOX", "Rajouri Garden", 6, 1200, "Ravi Verma");
        Theatre theatreThree = new Theatre(3, "Cinepolis", "Saket", 4, 800, "Sunita Rani");
        Theatre theatreFour = new Theatre(4, "Satyam Cineplex", "Patel Nagar", 3, 600, "Vikram Singh");
        Theatre theatreFive = new Theatre(5, "Carnival Cinemas", "Dwarka", 7, 1500, "Priya Yadav");
        Theatre theatreSix = new Theatre(6, "DT Cinemas", "Vasant Kunj", 5, 1000, "Manoj Gupta");
        Theatre theatreSeven = new Theatre(7, "Wave Cinemas", "Noida", 6, 1200, "Anjali Sharma");
        Theatre theatreEight = new Theatre(8, "Miraj Cinemas", "Faridabad", 4, 800, "Kiran Mehta");
        Theatre theatreNine = new Theatre(9, "Cinepolis", "Gurgaon", 3, 600, "Deepak Kumar");
        Theatre theatreTen = new Theatre(10, "PVR Cinemas", "Lajpat Nagar", 7, 1500, "Rakesh Yadav");
        Theatre theatreEleven = new Theatre(11, "INOX", "Kolkata", 5, 1000, "Neha Rani");
        Theatre theatreTwelve = new Theatre(12, "Cinepolis", "Mumbai", 6, 1200, "Amit Chauhan");
        Theatre theatreThirteen = new Theatre(13, "Satyam Cineplex", "Chandigarh", 4, 800, "Geeta Devi");
        Theatre theatreFourteen = new Theatre(14, "Carnival Cinemas", "Bangalore", 3, 600, "Harish Kumar");
        Theatre theatreFifteen = new Theatre(15, "DT Cinemas", "Hyderabad", 7, 1500, "Suman Rani");
        Theatre theatreSixteen = new Theatre(16, "Wave Cinemas", "Chennai", 5, 1000, "Rajesh Yadav");
        Theatre theatreSeventeen = new Theatre(17, "Miraj Cinemas", "Pune", 6, 1200, "Anil Mehta");
        Theatre theatreEighteen = new Theatre(18, "Cinepolis", "Ahmedabad", 4, 800, "Pooja Sharma");
        Theatre theatreNineteen = new Theatre(19, "PVR Cinemas", "Surat", 3, 600, "Vandana Gupta");
        Theatre theatreTwenty = new Theatre(20, "INOX", "Jaipur", 7, 1500, "Ravi Singh");

        theatres.add(theatreOne);
        theatres.add(theatreTwo);
        theatres.add(theatreThree);
        theatres.add(theatreFour);
        theatres.add(theatreFive);
        theatres.add(theatreSix);
        theatres.add(theatreSeven);
        theatres.add(theatreEight);
        theatres.add(theatreNine);
        theatres.add(theatreTen);
        theatres.add(theatreEleven);
        theatres.add(theatreTwelve);
        theatres.add(theatreThirteen);
        theatres.add(theatreFourteen);
        theatres.add(theatreFifteen);
        theatres.add(theatreSixteen);
        theatres.add(theatreSeventeen);
        theatres.add(theatreEighteen);
        theatres.add(theatreNineteen);
        theatres.add(theatreTwenty);

        System.out.println("Total theatres:");
        for (Theatre theatre : theatres) {
            System.out.println(theatre);
        }
        System.out.println();

        List<Theatre> theatres1 = new ArrayList<>();
        Theatre theatreTwentyOne = new Theatre(21, "Satyam Cineplex", "Delhi", 5, 1000, "Kiran Rani");
        Theatre theatreTwentyTwo = new Theatre(22, "Carnival Cinemas", "Mumbai", 6, 1200, "Rakesh Mehta");
        Theatre theatreTwentyThree = new Theatre(23, "DT Cinemas", "Bangalore", 4, 800, "Anjali Yadav");
        Theatre theatreTwentyFour = new Theatre(24, "Wave Cinemas", "Chennai", 3, 600, "Sunita Sharma");
        Theatre theatreTwentyFive = new Theatre(25, "Miraj Cinemas", "Hyderabad", 7, 1500, "Pooja Gupta");

        theatres1.add(theatreTwentyOne);
        theatres1.add(theatreTwentyTwo);
        theatres1.add(theatreTwentyThree);
        theatres1.add(theatreTwentyFour);
        theatres1.add(theatreTwentyFive);

        System.out.println("Total theatres of theatres1:");
        for (Theatre theatre : theatres1) {
            System.out.println(theatre);
        }
        System.out.println();

        System.out.println("Is theatres1 added to theatres: " + theatres.addAll(theatres1));
        System.out.println("Is theatres contains theatreSeven: " + theatres.contains(theatreSeven));
        System.out.println("Is theatres contains all theatres1: " + theatres.containsAll(theatres1));
        System.out.println();

        System.out.println("Total theatres:");
        for (Theatre theatre : theatres) {
            System.out.println(theatre);
        }

        System.out.println();
        System.out.println("Is theatreTwentyOne removed: " + theatres.remove(theatreTwentyOne));
        System.out.println("Is theatres1 removed from theatres: " + theatres.removeAll(theatres1));
        System.out.println();
        System.out.println("Total theatres:");
        for (Theatre theatre : theatres) {
            System.out.println(theatre);
        }
    }
}

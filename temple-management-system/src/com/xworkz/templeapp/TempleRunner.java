package com.xworkz.templeapp;

import com.xworkz.templeapp.temple.Temple;

import java.util.ArrayList;
import java.util.List;

public class TempleRunner {

    public static void main(String[] args) {

        List<Temple> temples = new ArrayList<>();

        Temple templeOne = new Temple(1, "Meenakshi Temple", "Madurai", 50000, "Meenakshi", "Dravidian");
        Temple templeTwo = new Temple(2, "Vaishno Devi Temple", "Katra", 30000, "Durga", "Traditional");
        Temple templeThree = new Temple(3, "Brihadeeswara Temple", "Thanjavur", 20000, "Shiva", "Chola");
        Temple templeFour = new Temple(4, "Golden Temple", "Amritsar", 40000, "Guru Granth Sahib", "Sikh");
        Temple templeFive = new Temple(5, "Jagannath Temple", "Puri", 25000, "Jagannath", "Kalinga");
        Temple templeSix = new Temple(6, "Somnath Temple", "Gujarat", 15000, "Shiva", "Solanki");
        Temple templeSeven = new Temple(7, "Kedarnath Temple", "Uttarakhand", 10000, "Shiva", "Himalayan");
        Temple templeEight = new Temple(8, "Konark Sun Temple", "Konark", 12000, "Surya", "Kalinga");
        Temple templeNine = new Temple(9, "Ramanathaswamy Temple", "Rameswaram", 18000, "Shiva", "Dravidian");
        Temple templeTen = new Temple(10, "Akshardham Temple", "Delhi", 22000, "Swaminarayan", "Modern");
        Temple templeEleven = new Temple(11, "Kashi Vishwanath", "Varanasi", 30000, "Shiva", "Uttar Pradesh");
        Temple templeTwelve = new Temple(12, "Ranganathaswamy Temple", "Srirangam", 14000, "Vishnu", "Dravidian");
        Temple templeThirteen = new Temple(13, "Dilwara Temples", "Mount Abu", 8000, "Jain Tirthankaras", "Maru-Gurjara");
        Temple templeFourteen = new Temple(14, "Virupaksha Temple", "Hampi", 11000, "Shiva", "Vijayanagara");
        Temple templeFifteen = new Temple(15, "Chennakesava Temple", "Belur", 9000, "Vishnu", "Hoysala");
        Temple templeSixteen = new Temple(16, "Shore Temple", "Mahabalipuram", 13000, "Shiva", "Pallava");
        Temple templeSeventeen = new Temple(17, "Lotus Temple", "Delhi", 25000, "Bahá’u’lláh", "Modern");
        Temple templeEighteen = new Temple(18, "Golden Pagoda Temple", "Kolkata", 16000, "Buddha", "Burmese");
        Temple templeNineteen = new Temple(19, "Mysore Chamundeshwari", "Mysore", 15000, "Chamundeshwari", "Dravidian");
        Temple templeTwenty = new Temple(20, "BAPS Akshardham", "Noida", 20000, "Swaminarayan", "Contemporary");

        temples.add(templeOne);
        temples.add(templeTwo);
        temples.add(templeThree);
        temples.add(templeFour);
        temples.add(templeFive);
        temples.add(templeSix);
        temples.add(templeSeven);
        temples.add(templeEight);
        temples.add(templeNine);
        temples.add(templeTen);
        temples.add(templeEleven);
        temples.add(templeTwelve);
        temples.add(templeThirteen);
        temples.add(templeFourteen);
        temples.add(templeFifteen);
        temples.add(templeSixteen);
        temples.add(templeSeventeen);
        temples.add(templeEighteen);
        temples.add(templeNineteen);
        temples.add(templeTwenty);

        System.out.println("Total temples:");
        for (Temple temple : temples) {
            System.out.println(temple);
        }
        System.out.println();

        List<Temple> temples1 = new ArrayList<>();
        Temple templeTwentyOne = new Temple(21, "Jagannath Temple", "Bhubaneswar", 23000, "Jagannath", "Kalinga");
        Temple templeTwentyTwo = new Temple(22, "Meenakshi Amman", "Madurai", 28000, "Meenakshi", "Dravidian");
        Temple templeTwentyThree = new Temple(23, "Kailasa Temple", "Ellora", 12000, "Shiva", "Rock-cut");
        Temple templeTwentyFour = new Temple(24, "Padmanabhaswamy Temple", "Thiruvananthapuram", 19000, "Vishnu", "Kerala");
        Temple templeTwentyFive = new Temple(25, "Jagannath Temple", "Kolkata", 21000, "Jagannath", "Modern");

        temples1.add(templeTwentyOne);
        temples1.add(templeTwentyTwo);
        temples1.add(templeTwentyThree);
        temples1.add(templeTwentyFour);
        temples1.add(templeTwentyFive);

        System.out.println("Total temples of temples1:");
        for (Temple temple : temples1) {
            System.out.println(temple);
        }
        System.out.println();

        System.out.println("Is temples1 added to temples: " + temples.addAll(temples1));
        System.out.println("Is temples contains templeSeven: " + temples.contains(templeSeven));
        System.out.println("Is temples contains all temples1: " + temples.containsAll(temples1));
        System.out.println();

        System.out.println("Total temples:");
        for (Temple temple : temples) {
            System.out.println(temple);
        }

        System.out.println();
        System.out.println("Is templeTwentyOne removed: " + temples.remove(templeTwentyOne));
        System.out.println("Is temples1 removed from temples: " + temples.removeAll(temples1));
        System.out.println();
        System.out.println("Total temples:");
        for (Temple temple : temples) {
            System.out.println(temple);
        }
    }
}

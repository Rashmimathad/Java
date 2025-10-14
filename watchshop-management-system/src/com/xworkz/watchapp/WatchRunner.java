package com.xworkz.watchapp;

import com.xworkz.watchapp.watch.Watch;

import java.util.ArrayList;
import java.util.List;

public class WatchRunner {

    public static void main(String[] args) {

        List<Watch> watches = new ArrayList<>();

        Watch watchOne = new Watch(1, "Rolex", 50000.0, "Gold", "Rolex SA", true);
        Watch watchTwo = new Watch(2, "Omega", 40000.0, "Stainless Steel", "Omega SA", true);
        Watch watchThree = new Watch(3, "Tag Heuer", 30000.0, "Titanium", "LVMH", false);
        Watch watchFour = new Watch(4, "Seiko", 15000.0, "Stainless Steel", "Seiko Holdings", true);
        Watch watchFive = new Watch(5, "Casio", 5000.0, "Resin", "Casio Computer Co.", false);
        Watch watchSix = new Watch(6, "Fossil", 8000.0, "Leather", "Fossil Group", true);
        Watch watchSeven = new Watch(7, "Citizen", 12000.0, "Stainless Steel", "Citizen Watch Co.", true);
        Watch watchEight = new Watch(8, "Timex", 4000.0, "Plastic", "Timex Group", false);
        Watch watchNine = new Watch(9, "Swatch", 7000.0, "Plastic", "Swatch Group", true);
        Watch watchTen = new Watch(10, "Michael Kors", 25000.0, "Stainless Steel", "Michael Kors", true);
        Watch watchEleven = new Watch(11, "Tissot", 22000.0, "Stainless Steel", "Swatch Group", true);
        Watch watchTwelve = new Watch(12, "Longines", 35000.0, "Stainless Steel", "Swatch Group", true);
        Watch watchThirteen = new Watch(13, "Bvlgari", 60000.0, "Gold", "LVMH", false);
        Watch watchFourteen = new Watch(14, "Hublot", 80000.0, "Titanium", "LVMH", true);
        Watch watchFifteen = new Watch(15, "Audemars Piguet", 90000.0, "Gold", "Audemars Piguet", true);
        Watch watchSixteen = new Watch(16, "Patek Philippe", 100000.0, "Platinum", "Patek Philippe", true);
        Watch watchSeventeen = new Watch(17, "Jaeger-LeCoultre", 70000.0, "Stainless Steel", "Richemont", false);
        Watch watchEighteen = new Watch(18, "IWC Schaffhausen", 75000.0, "Titanium", "Richemont", true);
        Watch watchNineteen = new Watch(19, "Panerai", 65000.0, "Bronze", "Richemont", true);
        Watch watchTwenty = new Watch(20, "Chopard", 95000.0, "Gold", "Chopard", false);

        watches.add(watchOne);
        watches.add(watchTwo);
        watches.add(watchThree);
        watches.add(watchFour);
        watches.add(watchFive);
        watches.add(watchSix);
        watches.add(watchSeven);
        watches.add(watchEight);
        watches.add(watchNine);
        watches.add(watchTen);
        watches.add(watchEleven);
        watches.add(watchTwelve);
        watches.add(watchThirteen);
        watches.add(watchFourteen);
        watches.add(watchFifteen);
        watches.add(watchSixteen);
        watches.add(watchSeventeen);
        watches.add(watchEighteen);
        watches.add(watchNineteen);
        watches.add(watchTwenty);

        System.out.println("Total watches:");
        for (Watch watch : watches) {
            System.out.println(watch);
        }
        System.out.println();

        List<Watch> watches1 = new ArrayList<>();
        Watch watchTwentyOne = new Watch(21, "Rolex", 50000.0, "Gold", "Rolex SA", true);
        Watch watchTwentyTwo = new Watch(22, "Omega", 40000.0, "Stainless Steel", "Omega SA", true);
        Watch watchTwentyThree = new Watch(23, "Tag Heuer", 30000.0, "Titanium", "LVMH", false);
        Watch watchTwentyFour = new Watch(24, "Seiko", 15000.0, "Stainless Steel", "Seiko Holdings", true);
        Watch watchTwentyFive = new Watch(25, "Casio", 5000.0, "Resin", "Casio Computer Co.", false);

        watches1.add(watchTwentyOne);
        watches1.add(watchTwentyTwo);
        watches1.add(watchTwentyThree);
        watches1.add(watchTwentyFour);
        watches1.add(watchTwentyFive);

        System.out.println("Total watches of watches1:");
        for (Watch watch : watches1) {
            System.out.println(watch);
        }
        System.out.println();

        System.out.println("Is watches1 added to watches: " + watches.addAll(watches1));
        System.out.println("Is watches contains watchSeven: " + watches.contains(watchSeven));
        System.out.println("Is watches contains all watches1: " + watches.containsAll(watches1));
        System.out.println();

        System.out.println("Total watches:");
        for (Watch watch : watches) {
            System.out.println(watch);
        }

        System.out.println();
        System.out.println("Is watchTwentyOne removed: " + watches.remove(watchTwentyOne));
        System.out.println("Is watches1 removed from watches: " + watches.removeAll(watches1));
        System.out.println();
        System.out.println("Total watches:");
        for (Watch watch : watches) {
            System.out.println(watch);
        }
    }
}

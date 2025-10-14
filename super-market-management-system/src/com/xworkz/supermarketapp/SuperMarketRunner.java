package com.xworkz.supermarketapp;

import com.xworkz.supermarketapp.supermarket.SuperMarket;

import java.util.ArrayList;
import java.util.List;

public class SuperMarketRunner {

    public static void main(String[] args) {

        List<SuperMarket> stores = new ArrayList<>();

        SuperMarket storeOne = new SuperMarket(1, "FreshMart", "Bangalore", 25, "9AM-9PM", 5);
        SuperMarket storeTwo = new SuperMarket(2, "DailyNeeds", "Mysore", 18, "8AM-8PM", 3);
        SuperMarket storeThree = new SuperMarket(3, "SuperSaver", "Hubli", 22, "10AM-10PM", 4);
        SuperMarket storeFour = new SuperMarket(4, "QuickBuy", "Mangalore", 20, "9AM-10PM", 6);
        SuperMarket storeFive = new SuperMarket(5, "ShopEasy", "Belgaum", 15, "7AM-9PM", 2);
        SuperMarket storeSix = new SuperMarket(6, "MegaStore", "Bangalore", 30, "8AM-11PM", 7);
        SuperMarket storeSeven = new SuperMarket(7, "CityMart", "Mysore", 16, "9AM-9PM", 3);
        SuperMarket storeEight = new SuperMarket(8, "ValueShop", "Hubli", 18, "8AM-10PM", 4);
        SuperMarket storeNine = new SuperMarket(9, "HyperBuy", "Mangalore", 28, "10AM-11PM", 6);
        SuperMarket storeTen = new SuperMarket(10, "EasyMart", "Belgaum", 12, "7AM-8PM", 2);
        SuperMarket storeEleven = new SuperMarket(11, "DailyFresh", "Bangalore", 24, "9AM-9PM", 5);
        SuperMarket storeTwelve = new SuperMarket(12, "SmartShop", "Mysore", 20, "8AM-10PM", 4);
        SuperMarket storeThirteen = new SuperMarket(13, "ValueMart", "Hubli", 22, "10AM-10PM", 5);
        SuperMarket storeFourteen = new SuperMarket(14, "QuickShop", "Mangalore", 18, "9AM-11PM", 3);
        SuperMarket storeFifteen = new SuperMarket(15, "SuperBuy", "Belgaum", 16, "8AM-9PM", 3);
        SuperMarket storeSixteen = new SuperMarket(16, "FreshChoice", "Bangalore", 26, "9AM-10PM", 6);
        SuperMarket storeSeventeen = new SuperMarket(17, "ShopMore", "Mysore", 19, "7AM-9PM", 4);
        SuperMarket storeEighteen = new SuperMarket(18, "MegaMart", "Hubli", 28, "10AM-11PM", 7);
        SuperMarket storeNineteen = new SuperMarket(19, "CityShop", "Mangalore", 21, "9AM-10PM", 5);
        SuperMarket storeTwenty = new SuperMarket(20, "QuickMart", "Belgaum", 14, "8AM-9PM", 3);

        stores.add(storeOne);
        stores.add(storeTwo);
        stores.add(storeThree);
        stores.add(storeFour);
        stores.add(storeFive);
        stores.add(storeSix);
        stores.add(storeSeven);
        stores.add(storeEight);
        stores.add(storeNine);
        stores.add(storeTen);
        stores.add(storeEleven);
        stores.add(storeTwelve);
        stores.add(storeThirteen);
        stores.add(storeFourteen);
        stores.add(storeFifteen);
        stores.add(storeSixteen);
        stores.add(storeSeventeen);
        stores.add(storeEighteen);
        stores.add(storeNineteen);
        stores.add(storeTwenty);

        System.out.println("Total stores:");
        for (SuperMarket store : stores) {
            System.out.println(store);
        }
        System.out.println();

        List<SuperMarket> additionalStores = new ArrayList<>();
        SuperMarket storeTwentyOne = new SuperMarket(21, "EasyShop", "Bangalore", 22, "9AM-9PM", 5);
        SuperMarket storeTwentyTwo = new SuperMarket(22, "ShopSmart", "Mysore", 18, "8AM-10PM", 4);
        SuperMarket storeTwentyThree = new SuperMarket(23, "QuickChoice", "Hubli", 20, "10AM-10PM", 5);
        SuperMarket storeTwentyFour = new SuperMarket(24, "ValueBuy", "Mangalore", 16, "9AM-11PM", 3);
        SuperMarket storeTwentyFive = new SuperMarket(25, "FreshShop", "Belgaum", 14, "8AM-9PM", 2);

        additionalStores.add(storeTwentyOne);
        additionalStores.add(storeTwentyTwo);
        additionalStores.add(storeTwentyThree);
        additionalStores.add(storeTwentyFour);
        additionalStores.add(storeTwentyFive);

        System.out.println("Total additional stores:");
        for (SuperMarket store : additionalStores) {
            System.out.println(store);
        }
        System.out.println();

        System.out.println("Is additionalStores added to stores: " + stores.addAll(additionalStores));
        System.out.println("Is stores contains storeSeven: " + stores.contains(storeSeven));
        System.out.println("Is stores contains all additionalStores: " + stores.containsAll(additionalStores));
        System.out.println();

        System.out.println("Total stores:");
        for (SuperMarket store : stores) {
            System.out.println(store);
        }

        System.out.println();
        System.out.println("Is storeTwentyOne removed: " + stores.remove(storeTwentyOne));
        System.out.println("Is additionalStores removed from stores: " + stores.removeAll(additionalStores));
        System.out.println();
        System.out.println("Total stores:");
        for (SuperMarket store : stores) {
            System.out.println(store);
        }
    }
}

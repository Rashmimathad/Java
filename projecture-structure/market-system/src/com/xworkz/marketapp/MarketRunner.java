package com.xworkz.marketapp;

import com.xworkz.marketapp.market.Market;

public class MarketRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Market market = new Market();
        market.setMarketName("KR Market");
        market.setTypeOfProductsSold("Vegetables");
        market.setIsWholeSale(true);
        market.setLocation("Yeshwantpur");
        market.setTimings("8:00 AM to 11:00 AM ");
        market.setIsOpenOnSunday(true);
        market.setIsMetroAvailable(true);

        System.out.println("Market Details : ");
        String marketName = market.getMarketName();
        String typeOfProductsSold = market.getTypeOfProductsSold();
        boolean isWholeSale = market.getIsWholeSale();
        String location = market.getLocation();
        String timings = market.getTimings();
        boolean isOpenOnSunday = market.getIsOpenOnSunday();
        boolean isMetroAvailable = market.getIsMetroAvailable();

        System.out.printf("Market name is : "+marketName);
        System.out.println("Type of products sold at the market are : "+typeOfProductsSold);
        System.out.println("Is WholeSale market? "+isWholeSale);
        System.out.println("Location of the market is : "+location);
        System.out.println("Timings of the market are : "+timings);
        System.out.println("Is market open on sunday? "+isOpenOnSunday);
        System.out.println("Is Metro available near market? "+isMetroAvailable);
        System.out.println("main ended");
    }
}

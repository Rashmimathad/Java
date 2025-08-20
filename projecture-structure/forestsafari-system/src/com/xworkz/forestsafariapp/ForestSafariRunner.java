package com.xworkz.forestsafariapp;

import com.xworkz.forestsafariapp.forestsafari.ForestSafari;

public class ForestSafariRunner{
    public static void main(String[] args) {
        System.out.println("main started");

        ForestSafari forestSafari = new ForestSafari();
        forestSafari.setSafariId(121);
        forestSafari.setSafariName("Bandipura safari");
        forestSafari.setSafariType("Zeep Safari");
        forestSafari.setSafariTimings("10:00 AM to 4:00 PM");
        forestSafari.setGroupSizeLimit(6);
        forestSafari.setIsGuideAvailable(true);

        System.out.println("Forest Safari Details : ");
        int safariId = forestSafari.getSafariId();
        String safariName = forestSafari.getSafariName();
        String safariType = forestSafari.getSafariType();
        String safariTimings = forestSafari.getSafariTimings();
        int groupSizeLimit = forestSafari.getGroupSizeLimit();
        boolean isGuideAvailable = forestSafari.getIsGuideAvailable();

        System.out.println("Id of safari is : "+safariId);
        System.out.println("Name of safari is : "+safariName);
        System.out.println("Type of safari is : "+safariType);
        System.out.println("Timings of safar is : "+safariTimings);
        System.out.println("size limit of the group of safari is : "+groupSizeLimit);
        System.out.println("Is Guide Available? "+isGuideAvailable);
        System.out.println("main ended");
    }
}

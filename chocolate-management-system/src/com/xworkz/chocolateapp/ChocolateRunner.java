package com.xworkz.chocolateapp;

import com.xworkz.chocolateapp.chocolate.Chocolate;
import com.xworkz.chocolateapp.dairymilk.DairyMilk;

public class ChocolateRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Chocolate chocolateOne=new DairyMilk();
        chocolateOne.chocolate();
        System.out.println("main ended");
    }
}

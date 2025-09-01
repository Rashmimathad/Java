package com.xworkz.cricketapp;

import com.xworkz.cricketapp.cricketer.Cricketer;
import com.xworkz.cricketapp.virat.Virat;

public class CricketRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Cricketer cricketerOne=new Virat();
        cricketerOne.cricketer();
        System.out.println("main ended");
    }
}

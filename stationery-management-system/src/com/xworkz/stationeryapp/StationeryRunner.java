package com.xworkz.stationeryapp;

import com.xworkz.stationeryapp.srihari.SriHari;
import com.xworkz.stationeryapp.stationery.Stationery;

public class StationeryRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Stationery stationeryOne=new SriHari();
        stationeryOne.stationery();
        System.out.println("main ended");
    }
}

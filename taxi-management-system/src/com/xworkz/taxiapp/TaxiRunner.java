package com.xworkz.taxiapp;

import com.xworkz.taxiapp.impl.UberImpl;
import com.xworkz.taxiapp.taxi.Taxi;

public class TaxiRunner {
    public static void main(String[] args) {
        Taxi taxi=new UberImpl();
        taxi.startRide();
        taxi.calculateFee();
        taxi.endRide();
    }
}

package com.xworkz.taxiapp.impl;

import com.xworkz.taxiapp.taxi.Taxi;

public class UberImpl implements Taxi {
    @Override
    public void startRide() {
        System.out.println("Ride started By Uber");
    }

    @Override
    public void endRide() {
        System.out.println("Ride ended By Uber");
    }

    @Override
    public void calculateFee() {
        System.out.println("Fee calculated By Uber");
    }
}

package com.xworkz.scooterapp.impl;

import com.xworkz.scooterapp.scooter.Scooter;

public class ElectricScooterImpl implements Scooter {
    @Override
    public void start() {
        System.out.println("Electric scooter started");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric scooter accelerated speed");
    }

    @Override
    public void brake() {
        System.out.println("Electric scooter stopped");
    }
}

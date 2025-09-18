package com.xworkz.scooterapp;

import com.xworkz.scooterapp.impl.ElectricScooterImpl;
import com.xworkz.scooterapp.scooter.Scooter;

public class ScooterRunner {
    public static void main(String[] args) {
        Scooter scooter=new ElectricScooterImpl();
        scooter.start();
        scooter.accelerate();
        scooter.brake();
    }
}

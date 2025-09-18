package com.xworkz.pilotapp.impl;

import com.xworkz.pilotapp.pilot.Pilot;

public class CommercialPilotImpl implements Pilot {
    @Override
    public void takeOff() {
        System.out.println("Commercial Pilot takes off the flight");
    }

    @Override
    public void fly() {
        System.out.println("Commercial pilot fly the flight");
    }

    @Override
    public void land() {
        System.out.println("Commercial pilot lands the flight");
    }
}

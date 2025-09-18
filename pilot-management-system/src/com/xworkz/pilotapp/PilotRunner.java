package com.xworkz.pilotapp;

import com.xworkz.pilotapp.impl.CommercialPilotImpl;
import com.xworkz.pilotapp.pilot.Pilot;

public class PilotRunner {
    public static void main(String[] args) {
        Pilot pilot=new CommercialPilotImpl();
        pilot.takeOff();
        pilot.fly();
        pilot.land();
    }
}

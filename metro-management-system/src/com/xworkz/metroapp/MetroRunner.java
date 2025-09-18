package com.xworkz.metroapp;

import com.xworkz.metroapp.impl.UndergroundMetroImpl;
import com.xworkz.metroapp.metro.Metro;

public class MetroRunner {
    public static void main(String[] args) {
            Metro metro=new UndergroundMetroImpl();
            metro.depart();
            metro.stop();
            metro.openDoors();
    }
}

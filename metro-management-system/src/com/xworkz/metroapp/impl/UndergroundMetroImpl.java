package com.xworkz.metroapp.impl;

import com.xworkz.metroapp.metro.Metro;

public class UndergroundMetroImpl implements Metro {
    @Override
    public void depart() {
        System.out.println("Underground Metro Departed");
    }

    @Override
    public void stop() {
        System.out.println("Underground metro stopped");
    }

    @Override
    public void openDoors() {
        System.out.println("Underground metro doors opened");
    }
}

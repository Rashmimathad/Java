package com.xworkz.doorbellapp.impl;

import com.xworkz.doorbellapp.doorbell.DoorBell;

public class WiredDoorBellImpl implements DoorBell {
    @Override
    public void ring() {
        System.out.println("Wired Door Bell Rings");
    }

    @Override
    public void stopRing() {
        System.out.println("Wired Door Bell stop ringing");
    }

    @Override
    public void changeTone() {
        System.out.println("Wired Door Bell  ringtone changed");
    }
}

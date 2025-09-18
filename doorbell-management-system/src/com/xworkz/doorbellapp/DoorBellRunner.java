package com.xworkz.doorbellapp;

import com.xworkz.doorbellapp.doorbell.DoorBell;
import com.xworkz.doorbellapp.impl.WiredDoorBellImpl;

public class DoorBellRunner {
    public static void main(String[] args) {
        DoorBell doorBell=new WiredDoorBellImpl();
        doorBell.ring();
        doorBell.stopRing();
        doorBell.changeTone();
    }
}

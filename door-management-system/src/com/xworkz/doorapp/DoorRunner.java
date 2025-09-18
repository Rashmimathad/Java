package com.xworkz.doorapp;

import com.xworkz.doorapp.door.Door;

public class DoorRunner {
    public static void main(String[] args) {
        Door door=new SlidingDoorImpl();
        door.open();
        door.close();
        door.lock();
    }
}

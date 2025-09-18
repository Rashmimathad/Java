package com.xworkz.doorapp;

import com.xworkz.doorapp.door.Door;

public class SlidingDoorImpl implements Door {
    @Override
    public void open() {
        System.out.println("Sliding door is opened");
    }

    @Override
    public void close() {
        System.out.println("Sliding door is closed");
    }

    @Override
    public void lock() {
        System.out.println("Sliding door is locked");
    }
}

package com.xworkz.keyapp.impl;


import com.xworkz.keyapp.key.CarKey;

public class BmwCarImpl implements CarKey {
    @Override
    public void lockCar() {
        System.out.println("BMW Car locked");
    }

    @Override
    public void unlockCar() {
        System.out.println("BMW Car unlocked");
    }

    @Override
    public void startCar() {
        System.out.println("BMW Car started");
    }
}

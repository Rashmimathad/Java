package com.xworkz.keyapp;

import com.xworkz.keyapp.impl.BmwCarImpl;
import com.xworkz.keyapp.key.CarKey;

public class CarRunner {
    public static void main(String[] args) {
        CarKey carKey=new BmwCarImpl();
        carKey.unlockCar();
        carKey.startCar();
        carKey.lockCar();
    }
}

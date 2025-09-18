package com.xworkz.truckapp.impl;

import com.xworkz.truckapp.truck.Truck;

public class MiniTruckImpl implements Truck {
    @Override
    public void load() {
        System.out.println("Loaded in MiniTruck");
    }

    @Override
    public void unload() {
        System.out.println("Unloaded from MiniTruck");
    }

    @Override
    public void drive() {
        System.out.println("Drive MiniTruck");
    }
}

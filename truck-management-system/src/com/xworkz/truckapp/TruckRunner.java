package com.xworkz.truckapp;

import com.xworkz.truckapp.impl.MiniTruckImpl;
import com.xworkz.truckapp.truck.Truck;

public class TruckRunner {
    public static void main(String[] args) {
        Truck truck= new MiniTruckImpl();
        truck.load();
        truck.unload();
        truck.drive();
    }
}

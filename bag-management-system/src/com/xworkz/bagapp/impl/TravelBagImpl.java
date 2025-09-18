package com.xworkz.bagapp.impl;

import com.xworkz.bagapp.bag.Bag;

public class TravelBagImpl implements Bag {
    @Override
    public void open() {
        System.out.println("Travel Bag is Open");
    }

    @Override
    public void close() {
        System.out.println("Travel Bag is close");
    }

    @Override
    public void carry() {
        System.out.println("Travel Bag  carry Luggage");
    }
}

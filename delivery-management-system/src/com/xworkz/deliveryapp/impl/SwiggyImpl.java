package com.xworkz.deliveryapp.impl;

import com.xworkz.deliveryapp.delivery.Delivery;

public class SwiggyImpl implements Delivery {
    @Override
    public void pickUp() {
        System.out.println("Swiggy delivery picks up the order");
    }

    @Override
    public void transport() {
        System.out.println("Swiggy delivery transport up the order");
    }

    @Override
    public void deliver() {
        System.out.println("Swiggy delivery deliver up the order");
    }
}

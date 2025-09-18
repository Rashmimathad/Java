package com.xworkz.deliveryapp;

import com.xworkz.deliveryapp.delivery.Delivery;
import com.xworkz.deliveryapp.impl.SwiggyImpl;

public class DeliveryRunner {
    public static void main(String[] args) {
        Delivery delivery=new SwiggyImpl();
        delivery.pickUp();
        delivery.transport();
        delivery.deliver();
    }
}

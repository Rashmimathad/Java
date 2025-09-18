package com.xworkz.bagapp;

import com.xworkz.bagapp.bag.Bag;
import com.xworkz.bagapp.impl.TravelBagImpl;

public class BagRunner {
    public static void main(String[] args) {
        Bag bag=new TravelBagImpl();
        bag.open();
        bag.close();
        bag.carry();
    }
}

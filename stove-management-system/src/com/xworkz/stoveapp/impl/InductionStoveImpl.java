package com.xworkz.stoveapp.impl;

import com.xworkz.stoveapp.stove.Stove;

public class InductionStoveImpl implements Stove {
    @Override
    public void ignite() {
        System.out.println("Induction stove ignited");
    }

    @Override
    public void adjustFlame() {
        System.out.println("Induction stove flame adjusted");
    }

    @Override
    public void turnOff() {
        System.out.println("Induction stove turned off");
    }
}

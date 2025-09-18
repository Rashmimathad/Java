package com.xworkz.stoveapp;

import com.xworkz.stoveapp.impl.InductionStoveImpl;
import com.xworkz.stoveapp.stove.Stove;

public class StoveRunner {
    public static void main(String[] args) {
        Stove stove=new InductionStoveImpl();
        stove.ignite();
        stove.adjustFlame();
        stove.turnOff();
    }
}

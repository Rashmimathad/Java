package com.xworkz.athleteapp.impl;

import com.xworkz.athleteapp.athlete.Athlete;

public class CricketerImpl implements Athlete {
    @Override
    public void train() {
        System.out.println("Cricketer is trained");
    }

    @Override
    public void compete() {
        System.out.println("Cricketer is competing");
    }

    @Override
    public void recover() {
        System.out.println("Cricketer is getting recovered");
    }
}

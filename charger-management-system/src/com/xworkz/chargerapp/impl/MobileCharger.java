package com.xworkz.chargerapp.impl;

import com.xworkz.chargerapp.charger.Charger;

public class MobileCharger implements Charger {
    @Override
    public void plugIn() {
        System.out.println("Mobile is Charging On");
    }

    @Override
    public void plugOut() {
        System.out.println("Mobile is Charged Off");
    }

    @Override
    public void chargeDevice() {
        System.out.println("Mobile is charge device");
    }
}

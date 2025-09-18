package com.xworkz.chargerapp;

import com.xworkz.chargerapp.charger.Charger;
import com.xworkz.chargerapp.impl.MobileCharger;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger charger=new MobileCharger();
        charger.chargeDevice();
        charger.plugIn();
        charger.plugOut();
    }
}

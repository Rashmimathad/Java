package com.xworkz.washingmachineapp;

import com.xworkz.washingmachineapp.impl.TopLoadWashingMachineImpl;
import com.xworkz.washingmachineapp.washingmachine.WashingMachine;

public class WashingMachineRunner {
    public static void main(String[] args) {
        WashingMachine washingMachine=new TopLoadWashingMachineImpl();
        washingMachine.wash();
        washingMachine.rinse();
        washingMachine.spin();
    }
}

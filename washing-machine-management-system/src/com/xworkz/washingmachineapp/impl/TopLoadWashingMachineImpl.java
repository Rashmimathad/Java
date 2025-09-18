package com.xworkz.washingmachineapp.impl;

import com.xworkz.washingmachineapp.washingmachine.WashingMachine;

public class TopLoadWashingMachineImpl implements WashingMachine {
    @Override
    public void wash() {
        System.out.println("Clothes washed in Top load washing machine");
    }

    @Override
    public void rinse() {
        System.out.println("Clothes rinsed in Top load washing machine");
    }

    @Override
    public void spin() {
        System.out.println("Clothes spinned in Top load washing machine");
    }
}

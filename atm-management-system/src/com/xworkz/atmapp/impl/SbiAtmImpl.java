package com.xworkz.atmapp.impl;

import com.xworkz.atmapp.atm.Atm;

public class SbiAtmImpl implements Atm {
    @Override
    public void deposit() {
        System.out.println("Amount deposited by using Sbi Atm");
    }

    @Override
    public void withdraw() {
        System.out.println("Amount withdrawed from Sbi Atm");
    }

    @Override
    public void checkBalance() {
        System.out.println("check balance by using Sbi Atm");
    }
}

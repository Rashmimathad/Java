package com.xworkz.atmapp;

import com.xworkz.atmapp.atm.Atm;
import com.xworkz.atmapp.impl.SbiAtmImpl;

public class AtmRunner {
    public static void main(String[] args) {
        Atm atm=new SbiAtmImpl();
        atm.checkBalance();
        atm.withdraw();
        atm.deposit();
    }
}

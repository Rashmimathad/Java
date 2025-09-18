package com.xwrokz.billapp.impl;

import com.xwrokz.billapp.bill.Bill;

public class InternetBillImpl implements Bill {
    @Override
    public void generate() {
        System.out.println("Internet Bill generated");
    }

    @Override
    public void pay() {
        System.out.println("Internet Bill payment done");
    }

    @Override
    public void print() {
        System.out.println("Internet Bill printed");
    }
}

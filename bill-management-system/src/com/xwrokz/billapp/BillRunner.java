package com.xwrokz.billapp;

import com.xwrokz.billapp.bill.Bill;
import com.xwrokz.billapp.impl.InternetBillImpl;

public class BillRunner {
    public static void main(String[] args) {
        Bill bill=new InternetBillImpl();
        bill.generate();
        bill.pay();
        bill.print();
    }
}

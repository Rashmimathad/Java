package com.xworkz.paymentapp.impl;

import com.xworkz.paymentapp.payment.Payment;

public class UpiPaymentImpl implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment done through UPI payment");
    }

    @Override
    public void refund() {
        System.out.println("Refund received through UPI payment");
    }

    @Override
    public void checkStatus() {
        System.out.println("Status checked through upi payment");
    }
}

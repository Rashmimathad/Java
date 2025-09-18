package com.xworkz.paymentapp;

import com.xworkz.paymentapp.impl.UpiPaymentImpl;
import com.xworkz.paymentapp.payment.Payment;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment payment=new UpiPaymentImpl();
        payment.pay();
        payment.checkStatus();
        payment.refund();
    }
}

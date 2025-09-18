package com.xworkz.cardapp.impl;

import com.xworkz.cardapp.card.Card;

public class CreditCardImpl implements Card {
    @Override
    public void swipe() {
        System.out.println("Amount deducted by swiping credit card");
    }

    @Override
    public void insert() {
        System.out.println("Amount deducted by inserting credit card");
    }

    @Override
    public void checkBalance() {
        System.out.println("Check balance from Credit card");

    }
}

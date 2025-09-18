package com.xworkz.cardapp;

import com.xworkz.cardapp.card.Card;
import com.xworkz.cardapp.impl.CreditCardImpl;

public class CardRunner {
    public static void main(String[] args) {
        Card card=new CreditCardImpl();
        card.insert();
        card.checkBalance();
        card.swipe();
    }
}

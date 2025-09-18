package com.xworkz.walletapp.impl;

import com.xworkz.walletapp.wallet.Wallet;

public class DigitalWalletImpl implements Wallet {
    @Override
    public void addMoney() {
        System.out.println("Money added for digital wallet");
    }

    @Override
    public void spendMoney() {
        System.out.println("Money spent from digital wallet");
    }

    @Override
    public void checkBalance() {
        System.out.println("Digital wallet balance checked");
    }
}

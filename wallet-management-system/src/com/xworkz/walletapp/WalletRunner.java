package com.xworkz.walletapp;

import com.xworkz.walletapp.impl.DigitalWalletImpl;
import com.xworkz.walletapp.wallet.Wallet;

public class WalletRunner {
    public static void main(String[] args) {
        Wallet wallet=new DigitalWalletImpl();
        wallet.addMoney();
        wallet.checkBalance();
        wallet.spendMoney();
    }
}

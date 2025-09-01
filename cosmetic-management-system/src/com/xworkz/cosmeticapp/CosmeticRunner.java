package com.xworkz.cosmeticapp;

import com.xworkz.cosmeticapp.cosmetic.Cosmetic;
import com.xworkz.cosmeticapp.lipstick.LipStick;

public class CosmeticRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Cosmetic cosmeticOne=new LipStick();
        cosmeticOne.cosmetic();
        System.out.println("main ended");
    }
}

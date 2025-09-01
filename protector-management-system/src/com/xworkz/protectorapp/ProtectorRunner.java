package com.xworkz.protectorapp;

import com.xworkz.protectorapp.protector.Protector;
import com.xworkz.protectorapp.soldier.Soldier;

public class ProtectorRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Protector protectorOne=new Soldier();
        protectorOne.protector();
        System.out.println("main ended");
    }
}

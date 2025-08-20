package com.xworkz.laptopapp;

import com.xworkz.laptopapp.dell.Dell;
import com.xworkz.laptopapp.hp.Hp;

public class LaptopRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Dell dell=new Dell();
        Hp hp=new Hp();
        System.out.println("main ended");
    }
}

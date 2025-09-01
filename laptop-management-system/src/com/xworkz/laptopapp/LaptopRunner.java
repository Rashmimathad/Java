package com.xworkz.laptopapp;

import com.xworkz.laptopapp.dell.Dell;
import com.xworkz.laptopapp.hp.Hp;
import com.xworkz.laptopapp.laptop.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Laptop laptopOne=new Dell();
        laptopOne.laptop();
        System.out.println("main ended");
    }
}

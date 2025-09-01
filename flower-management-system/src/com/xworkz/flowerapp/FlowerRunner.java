package com.xworkz.flowerapp;

import com.xworkz.flowerapp.flower.Flower;
import com.xworkz.flowerapp.lotus.Lotus;

public class FlowerRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Flower flowerOne=new Lotus();
        flowerOne.flower();
        System.out.println("main ended");
    }
}

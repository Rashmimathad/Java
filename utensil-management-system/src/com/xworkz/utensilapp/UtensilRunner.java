package com.xworkz.utensilapp;

import com.xworkz.utensilapp.spoon.Spoon;
import com.xworkz.utensilapp.utensil.Utensil;

public class UtensilRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Utensil utensilOne=new Spoon();
        utensilOne.utensil();
        System.out.println("main ended");
    }
}

package com.xworkz.harbourapp;

import com.xworkz.harbourapp.harbour.Harbour;
import com.xworkz.harbourapp.newmanglore.NewManglore;

public class HarbourRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Harbour harbourOne=new NewManglore();
        harbourOne.harbour();
        System.out.println("main ended");
    }
}

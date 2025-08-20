package com.xworkz.browserapp;

import com.xworkz.browserapp.firefox.FireFox;

public class BrowserRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        FireFox fireFox=new FireFox();
        System.out.println("main ended");
    }
}

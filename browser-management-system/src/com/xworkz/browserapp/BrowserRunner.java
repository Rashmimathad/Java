package com.xworkz.browserapp;

import com.xworkz.browserapp.browser.Browser;
import com.xworkz.browserapp.firefox.FireFox;

public class BrowserRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Browser browserOne=new FireFox();
        browserOne.browser();
        System.out.println("main ended");
    }
}

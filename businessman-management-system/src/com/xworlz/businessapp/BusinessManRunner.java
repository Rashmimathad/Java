package com.xworlz.businessapp;

import com.xworlz.businessapp.businessman.BusinessMan;
import com.xworlz.businessapp.ratantata.RatanTata;

public class BusinessManRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        BusinessMan businessManOne=new RatanTata();
        businessManOne.businessMan();
        System.out.println("main ended");
    }
}

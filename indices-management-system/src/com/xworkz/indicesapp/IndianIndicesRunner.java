package com.xworkz.indicesapp;


import com.xworkz.indicesapp.indianindices.IndianIndices;
import com.xworkz.indicesapp.niftyFifty.NiftyFifty;

public class IndianIndicesRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        IndianIndices indicesOne=new NiftyFifty();
        indicesOne.indices();
        System.out.println("main ended");
    }
}

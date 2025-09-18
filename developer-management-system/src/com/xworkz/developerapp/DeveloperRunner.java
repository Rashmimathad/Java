package com.xworkz.developerapp;

import com.xworkz.developerapp.developer.Developer;
import com.xworkz.developerapp.impl.JavaDeveloperImpl;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer=new JavaDeveloperImpl();
        developer.code();
        developer.debug();
        developer.deploy();
    }
}

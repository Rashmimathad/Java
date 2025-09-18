package com.xworkz.engineerapp;

import com.xworkz.engineerapp.engineer.Engineer;
import com.xworkz.engineerapp.impl.SoftwareEngineerImpl;

public class EngineerRunner {
    public static void main(String[] args) {
        Engineer engineer=new SoftwareEngineerImpl();
        engineer.design();
        engineer.build();
        engineer.test();
    }
}

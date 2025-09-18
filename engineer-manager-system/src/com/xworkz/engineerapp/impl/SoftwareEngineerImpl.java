package com.xworkz.engineerapp.impl;

import com.xworkz.engineerapp.engineer.Engineer;

public class SoftwareEngineerImpl implements Engineer {
    @Override
    public void build() {
        System.out.println("Software engineer build the project");
    }

    @Override
    public void design() {
        System.out.println("Software engineer design the project");
    }

    @Override
    public void test() {
        System.out.println("Software engineer test the project");
    }
}

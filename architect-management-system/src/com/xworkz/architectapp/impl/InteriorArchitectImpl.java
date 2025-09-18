package com.xworkz.architectapp.impl;

import com.xworkz.architectapp.architect.Architect;

public class InteriorArchitectImpl implements Architect {
    @Override
    public void plan() {
        System.out.println("Interior architect plans the interior design");
    }

    @Override
    public void draw() {
        System.out.println("Interior architect draws the interior design");
    }

    @Override
    public void supervise() {
        System.out.println("Interior architect supervise the work of making interior design");
    }
}

package com.xworkz.penapp.impl;

import com.xworkz.penapp.pen.Pen;

public class InkPenImpl implements Pen {

    @Override
    public void write() {
        System.out.println("Ink Pen used to write");
    }

    @Override
    public void refill() {
        System.out.println("Ink Pen used to refill ink");
    }

    @Override
    public void closeCap() {
        System.out.println("Ink Pen cap closed");
    }
}

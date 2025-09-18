package com.xworkz.penapp;

import com.xworkz.penapp.impl.InkPenImpl;
import com.xworkz.penapp.pen.Pen;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen=new InkPenImpl();
        pen.write();
        pen.refill();
        pen.closeCap();
    }
}

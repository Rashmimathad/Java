package com.xworkz.instrumentapp;

import com.xworkz.instrumentapp.guitar.Guitar;
import com.xworkz.instrumentapp.instrument.Instrument;

public class InstrumentRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Instrument instrumentOne=new Guitar();
        instrumentOne.instrument();
        System.out.println("main ended");
    }
}

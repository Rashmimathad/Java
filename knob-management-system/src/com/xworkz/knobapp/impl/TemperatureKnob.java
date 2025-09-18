package com.xworkz.knobapp.impl;

import com.xworkz.knobapp.knob.Knob;

public class TemperatureKnob implements Knob {
    @Override
    public void rotateLeft() {
        System.out.println("Decreases temperature");
    }

    @Override
    public void rotateRight() {
        System.out.println("Increases Temperature");
    }

    @Override
    public void reset() {
        System.out.println("Reset Temperature");
    }
}

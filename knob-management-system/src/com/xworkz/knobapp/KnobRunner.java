package com.xworkz.knobapp;

import com.xworkz.knobapp.impl.TemperatureKnob;
import com.xworkz.knobapp.knob.Knob;

public class KnobRunner {
    public static void main(String[] args) {
        Knob knob=new TemperatureKnob();
        knob.rotateLeft();
        knob.rotateRight();
        knob.reset();
    }
}

package com.xworkz.clockapp;

import com.xworkz.clockapp.clock.Clock;
import com.xworkz.clockapp.impl.DigitalClockImpl;

public class ClockRunner {
    public static void main(String[] args) {
        Clock clock=new DigitalClockImpl();
        clock.showTime();
        clock.setAlarm();
        clock.stopAlarm();
    }
}

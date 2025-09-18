package com.xworkz.clockapp.impl;

import com.xworkz.clockapp.clock.Clock;

public class DigitalClockImpl implements Clock {
    @Override
    public void showTime() {
        System.out.println("Digital Clock shows Time");
    }

    @Override
    public void setAlarm() {
        System.out.println("Digital Clock sets Alarm");
    }

    @Override
    public void stopAlarm() {
        System.out.println("Digital Clock stops Alarm");
    }
}

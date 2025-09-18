package com.xworkz.speakerapp.impl;

import com.xworkz.speakerapp.Speaker.Speaker;

public class BluetoothSpeakerImpl implements Speaker {
    @Override
    public void increaseVolume() {
        System.out.println("Bluetooth Speaker volume Increased");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Bluetooth Speaker volume Decreased");
    }

    @Override
    public void mute() {
        System.out.println("Bluetooth Speaker volume is Muted");
    }
}

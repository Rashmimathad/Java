package com.xworkz.speakerapp;

import com.xworkz.speakerapp.Speaker.Speaker;
import com.xworkz.speakerapp.impl.BluetoothSpeakerImpl;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker speaker=new BluetoothSpeakerImpl();
        speaker.increaseVolume();
        speaker.decreaseVolume();
        speaker.mute();
    }
}

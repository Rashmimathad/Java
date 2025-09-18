package com.xworkz.networkapp.impl;

import com.xworkz.networkapp.network.Network;

public class BluetoothImpl implements Network {
    @Override
    public void connect() {
        System.out.println("Bluetooth connected");
    }

    @Override
    public void disConnect() {
        System.out.println("Bluetooth disconnected");
    }

    @Override
    public void transferData() {
        System.out.println("Data transferred through bluetooth");
    }
}

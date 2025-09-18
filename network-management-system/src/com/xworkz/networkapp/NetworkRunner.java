package com.xworkz.networkapp;

import com.xworkz.networkapp.impl.BluetoothImpl;
import com.xworkz.networkapp.network.Network;

public class NetworkRunner {
    public static void main(String[] args) {
        Network network=new BluetoothImpl();
        network.connect();
        network.transferData();
        network.disConnect();
    }
}

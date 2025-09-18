package com.xworkz.remoteapp.impl;

import com.xworkz.remoteapp.remote.Remote;

public class TvRemoteImpl implements Remote {

    public TvRemoteImpl(){

    }

    @Override
    public void powerOn() {
        System.out.println("TV Remote power on");
    }

    @Override
    public void powerOff() {
        System.out.println("TV Remote power off");
    }

    @Override
    public void typeOfRemote() {
        System.out.println("The type of TV Remote is Bluetooth Remote");
    }

}

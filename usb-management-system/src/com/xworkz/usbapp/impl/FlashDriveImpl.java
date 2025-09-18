package com.xworkz.usbapp.impl;

import com.xworkz.usbapp.usbdrive.UsbDrive;

public class FlashDriveImpl implements UsbDrive {
    @Override
    public void readData() {
        System.out.println("FlashDrive reads data");
    }

    @Override
    public void writeData() {
        System.out.println("FlashDrive writes data");
    }

    @Override
    public void ejectDrive() {
        System.out.println("eject FlashDrive");
    }
}

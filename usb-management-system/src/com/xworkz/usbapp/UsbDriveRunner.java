package com.xworkz.usbapp;

import com.xworkz.usbapp.impl.FlashDriveImpl;
import com.xworkz.usbapp.usbdrive.UsbDrive;

public class UsbDriveRunner {
    public static void main(String[] args) {
        UsbDrive usbDrive=new FlashDriveImpl();
        usbDrive.readData();
        usbDrive.writeData();
        usbDrive.ejectDrive();
    }
}

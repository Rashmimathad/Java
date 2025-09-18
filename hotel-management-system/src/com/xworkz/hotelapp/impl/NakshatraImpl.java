package com.xworkz.hotelapp.impl;

import com.xworkz.hotelapp.yatra.Yatra;

public class NakshatraImpl implements Yatra {
    @Override
    public void bookRoom() {
        System.out.println("Room Booked in Nakshatra hotel");
    }

    @Override
    public void checkIn() {
        System.out.println("Checked in Nakshatra hotel");
    }

    @Override
    public void checkOut() {
        System.out.println("Checked out from Nakshatra hotel");
    }
}

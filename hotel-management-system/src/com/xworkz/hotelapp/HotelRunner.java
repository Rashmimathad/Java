package com.xworkz.hotelapp;

import com.xworkz.hotelapp.impl.NakshatraImpl;
import com.xworkz.hotelapp.yatra.Yatra;

public class HotelRunner {
    public static void main(String[] args) {
        Yatra yatra=new NakshatraImpl();
        yatra.bookRoom();
        yatra.checkIn();
        yatra.checkOut();
    }
}

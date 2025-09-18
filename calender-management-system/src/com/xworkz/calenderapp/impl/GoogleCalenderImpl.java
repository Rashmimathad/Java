package com.xworkz.calenderapp.impl;

import com.xworkz.calenderapp.calender.Calender;

public class GoogleCalenderImpl implements Calender {
    @Override
    public void addEvent() {
        System.out.println("Event is added in Google Calender");
    }

    @Override
    public void removeEvent() {
        System.out.println("Event is remove from Google Calender");
    }

    @Override
    public void showDate() {
        System.out.println("Date showed from Google Calender");
    }
}

package com.xworkz.calenderapp;

import com.xworkz.calenderapp.calender.Calender;
import com.xworkz.calenderapp.impl.GoogleCalenderImpl;

public class CalenderRunner {
    public static void main(String[] args) {
        Calender calender=new GoogleCalenderImpl();
        calender.addEvent();
        calender.showDate();
        calender.showDate();
    }
}

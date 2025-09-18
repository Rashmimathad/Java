package com.xworkz.movietickteapp;

import com.xworkz.movietickteapp.movieticket.BookMyShow;

public class NavrangTheatreImpl implements BookMyShow {
    @Override
    public void bookTicket() {
        System.out.println("Ticket booked at Navrang theatre");
    }

    @Override
    public void getDetails() {
        System.out.println("Get Ticket details from  Navrang theatre");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Ticket cancelled at Navrang theatre");
    }
}

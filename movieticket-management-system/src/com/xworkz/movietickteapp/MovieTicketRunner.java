package com.xworkz.movietickteapp;

import com.xworkz.movietickteapp.movieticket.BookMyShow;

public class MovieTicketRunner {
    public static void main(String[] args) {
        BookMyShow bookMyShow=new NavrangTheatreImpl();
        bookMyShow.bookTicket();
        bookMyShow.getDetails();
        bookMyShow.cancelTicket();
    }
}

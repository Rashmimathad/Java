package com.xworkz.bookingapp;

import com.xworkz.bookingapp.ticketbooking.TicketBooking;
import com.xworkz.bookingapp.constants.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class TicketBookingRunner {

    public static void main(String[] args) {

        List<TicketBooking> bookings = new ArrayList<>();

        TicketBooking bookingOne = new TicketBooking(1, "John Doe", "Bangalore", "Mysore", PaymentMethod.CREDIT_CARD, 2);
        TicketBooking bookingTwo = new TicketBooking(2, "Jane Smith", "Mysore", "Bangalore", PaymentMethod.DEBIT_CARD, 1);
        TicketBooking bookingThree = new TicketBooking(3, "Alice Johnson", "Hubli", "Belgaum", PaymentMethod.UPI, 3);
        TicketBooking bookingFour = new TicketBooking(4, "Bob Brown", "Mangalore", "Bangalore", PaymentMethod.CASH, 1);
        TicketBooking bookingFive = new TicketBooking(5, "Charlie Davis", "Belgaum", "Hubli", PaymentMethod.CREDIT_CARD, 2);
        TicketBooking bookingSix = new TicketBooking(6, "Diana Evans", "Bangalore", "Mangalore", PaymentMethod.UPI, 4);
        TicketBooking bookingSeven = new TicketBooking(7, "Eve Harris", "Mysore", "Belgaum", PaymentMethod.DEBIT_CARD, 2);
        TicketBooking bookingEight = new TicketBooking(8, "Frank Clark", "Hubli", "Mysore", PaymentMethod.CASH, 1);
        TicketBooking bookingNine = new TicketBooking(9, "Grace Lewis", "Mangalore", "Hubli", PaymentMethod.CREDIT_CARD, 3);
        TicketBooking bookingTen = new TicketBooking(10, "Henry Walker", "Belgaum", "Bangalore", PaymentMethod.UPI, 2);
        TicketBooking bookingEleven = new TicketBooking(11, "Ivy Hall", "Bangalore", "Hubli", PaymentMethod.CREDIT_CARD, 1);
        TicketBooking bookingTwelve = new TicketBooking(12, "Jack Allen", "Mysore", "Mangalore", PaymentMethod.DEBIT_CARD, 2);
        TicketBooking bookingThirteen = new TicketBooking(13, "Kathy Young", "Hubli", "Belgaum", PaymentMethod.UPI, 3);
        TicketBooking bookingFourteen = new TicketBooking(14, "Leo Hernandez", "Mangalore", "Mysore", PaymentMethod.CASH, 2);
        TicketBooking bookingFifteen = new TicketBooking(15, "Mona King", "Belgaum", "Bangalore", PaymentMethod.CREDIT_CARD, 1);
        TicketBooking bookingSixteen = new TicketBooking(16, "Nina Wright", "Bangalore", "Mysore", PaymentMethod.UPI, 2);
        TicketBooking bookingSeventeen = new TicketBooking(17, "Oscar Scott", "Mysore", "Hubli", PaymentMethod.DEBIT_CARD, 3);
        TicketBooking bookingEighteen = new TicketBooking(18, "Paul Green", "Hubli", "Mangalore", PaymentMethod.CASH, 1);
        TicketBooking bookingNineteen = new TicketBooking(19, "Quincy Adams", "Mangalore", "Belgaum", PaymentMethod.CREDIT_CARD, 2);
        TicketBooking bookingTwenty = new TicketBooking(20, "Rachel Baker", "Belgaum", "Bangalore", PaymentMethod.UPI, 3);

        bookings.add(bookingOne);
        bookings.add(bookingTwo);
        bookings.add(bookingThree);
        bookings.add(bookingFour);
        bookings.add(bookingFive);
        bookings.add(bookingSix);
        bookings.add(bookingSeven);
        bookings.add(bookingEight);
        bookings.add(bookingNine);
        bookings.add(bookingTen);
        bookings.add(bookingEleven);
        bookings.add(bookingTwelve);
        bookings.add(bookingThirteen);
        bookings.add(bookingFourteen);
        bookings.add(bookingFifteen);
        bookings.add(bookingSixteen);
        bookings.add(bookingSeventeen);
        bookings.add(bookingEighteen);
        bookings.add(bookingNineteen);
        bookings.add(bookingTwenty);

        System.out.println("Total bookings:");
        for (TicketBooking booking : bookings) {
            System.out.println(booking);
        }
        System.out.println();

        List<TicketBooking> additionalBookings = new ArrayList<>();
        TicketBooking bookingTwentyOne = new TicketBooking(21, "Steve Moore", "Bangalore", "Mysore", PaymentMethod.CREDIT_CARD, 2);
        TicketBooking bookingTwentyTwo = new TicketBooking(22, "Tracy Taylor", "Mysore", "Bangalore", PaymentMethod.UPI, 1);
        TicketBooking bookingTwentyThree = new TicketBooking(23, "Uma Harris", "Hubli", "Belgaum", PaymentMethod.DEBIT_CARD, 3);
        TicketBooking bookingTwentyFour = new TicketBooking(24, "Victor Martinez", "Mangalore", "Bangalore", PaymentMethod.CASH, 2);
        TicketBooking bookingTwentyFive = new TicketBooking(25, "Wendy Robinson", "Belgaum", "Hubli", PaymentMethod.UPI, 1);

        additionalBookings.add(bookingTwentyOne);
        additionalBookings.add(bookingTwentyTwo);
        additionalBookings.add(bookingTwentyThree);
        additionalBookings.add(bookingTwentyFour);
        additionalBookings.add(bookingTwentyFive);

        System.out.println("Total additional bookings:");
        for (TicketBooking booking : additionalBookings) {
            System.out.println(booking);
        }
        System.out.println();

        System.out.println("Is additionalBookings added to bookings: " + bookings.addAll(additionalBookings));
        System.out.println("Is bookings contains bookingSeven: " + bookings.contains(bookingSeven));
        System.out.println("Is bookings contains all additionalBookings: " + bookings.containsAll(additionalBookings));
        System.out.println();

        System.out.println("Total bookings:");
        for (TicketBooking booking : bookings) {
            System.out.println(booking);
        }

        System.out.println();
        System.out.println("Is bookingTwentyOne removed: " + bookings.remove(bookingTwentyOne));
        System.out.println("Is additionalBookings removed from bookings: " + bookings.removeAll(additionalBookings));
        System.out.println();
        System.out.println("Total bookings:");
        for (TicketBooking booking : bookings) {
            System.out.println(booking);
        }
    }
}

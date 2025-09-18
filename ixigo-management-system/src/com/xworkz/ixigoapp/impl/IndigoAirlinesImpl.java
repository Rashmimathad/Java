package com.xworkz.ixigoapp.impl;

import com.xworkz.ixigoapp.ixigo.Ixigo;

public class IndigoAirlinesImpl implements Ixigo {
    @Override
    public void doTicketBooking() {
        System.out.println("Indigo Airlines flight Ticket Booked");
    }

    @Override
    public boolean checkAvailability() {
        return true;
    }

    @Override
    public void cancelTicket() {
        System.out.println("Indigo Airlines flight ticket cancelled");
    }
}

package com.xworkz.ixigoapp;

import com.xworkz.ixigoapp.impl.IndigoAirlinesImpl;
import com.xworkz.ixigoapp.ixigo.Ixigo;

public class IxigoRunner {
    public static void main(String[] args) {
        Ixigo ixigo=new IndigoAirlinesImpl();
        System.out.println("Is Indigo Airlines flight ticket available? "+ixigo.checkAvailability());
        ixigo.doTicketBooking();
        ixigo.cancelTicket();
    }
}

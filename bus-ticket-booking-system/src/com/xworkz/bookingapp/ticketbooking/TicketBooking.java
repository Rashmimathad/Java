package com.xworkz.bookingapp.ticketbooking;

import com.xworkz.bookingapp.constants.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TicketBooking {
    private int userId;
    private String userName;
    private String sourceLocation;
    private String destinationLocation;
    private PaymentMethod paymentMethod;
    private int noOfSeats;

    @Override
    public String toString() {
        return "TicketBooking{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sourceLocation='" + sourceLocation + '\'' +
                ", destinationLocation='" + destinationLocation + '\'' +
                ", paymentMethod=" + paymentMethod +
                ", noOfSeats=" + noOfSeats +
                '}';
    }
}

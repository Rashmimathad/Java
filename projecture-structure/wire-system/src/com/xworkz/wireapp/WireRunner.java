package com.xworkz.wireapp;

import com.xworkz.wireapp.wire.Wire;

public class WireRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        Wire wire = new Wire();
        wire.setWireId(1);
        wire.setBrandName("Finolex");
        wire.setColor("White");
        wire.setLengthInMeters(3);
        wire.setPrice(250.00);

        System.out.println("Wire Details : ");
        int wireId = wire.getWireId();
        String brandName = wire.getBrandName();
        String wireColor = wire.getColor();
        int length = wire.getLengthInMeters();
        double price =  wire.getPrice();

        System.out.println("Id of wire is : "+wireId);
        System.out.println("Brand name of wire is : "+brandName);
        System.out.println("color of the wire is : "+wireColor);
        System.out.println("length of the wire is : "+length+" metres");
        System.out.println("Price of the wire is : "+price);
        System.out.println("main ended");
    }
}

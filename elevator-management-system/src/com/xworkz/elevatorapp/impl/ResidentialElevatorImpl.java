package com.xworkz.elevatorapp.impl;

import com.xworkz.elevatorapp.elevator.Elevator;

public class ResidentialElevatorImpl implements Elevator {

    public ResidentialElevatorImpl(){

    }

    @Override
    public void elevatorOpen() {
        System.out.println("Residential Elevator is Open");
    }

    @Override
    public void elevatorClose() {
        System.out.println("Residential Elevator is Close");
    }

    @Override
    public void moveUp() {
        System.out.println("Residential Elevator is moved up");
    }
}

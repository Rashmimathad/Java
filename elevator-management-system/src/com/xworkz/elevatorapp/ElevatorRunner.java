package com.xworkz.elevatorapp;

import com.xworkz.elevatorapp.elevator.Elevator;
import com.xworkz.elevatorapp.impl.ResidentialElevatorImpl;

public class ElevatorRunner {
    public static void main(String[] args) {
        Elevator elevator=new ResidentialElevatorImpl();
        elevator.elevatorOpen();
        elevator.moveUp();
        elevator.elevatorClose();
    }
}

package com.xworkz.skateboardapp.impl;

import com.xworkz.skateboardapp.skateboard.SkateBoard;

public class ElectricSkateBoardImpl implements SkateBoard {
    @Override
    public void roll() {
        System.out.println("Electric Skateboard rolled");
    }

    @Override
    public void stop() {
        System.out.println("Electric Skateboard Stopped");
    }

    @Override
    public void flip() {
        System.out.println("Electric Skateboard flipped");
    }
}

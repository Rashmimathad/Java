package com.xworkz.skateboardapp;

import com.xworkz.skateboardapp.impl.ElectricSkateBoardImpl;
import com.xworkz.skateboardapp.skateboard.SkateBoard;

public class SkateBoardRunner {
    public static void main(String[] args) {
        SkateBoard skateBoard=new ElectricSkateBoardImpl();
        skateBoard.roll();
        skateBoard.flip();
        skateBoard.stop();
    }
}

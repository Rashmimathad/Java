package com.xworkz.cupboardapp.impl;

import com.xworkz.cupboardapp.cupboard.CupBoard;

public class WoodenCupBoardImpl implements CupBoard {
    @Override
    public void open() {
        System.out.println("Wooden cupboard is open");
    }

    @Override
    public void close() {
        System.out.println("Wooden cupboard is close");
    }

    @Override
    public void lock() {
        System.out.println("Wooden cupboard is locked");
    }
}

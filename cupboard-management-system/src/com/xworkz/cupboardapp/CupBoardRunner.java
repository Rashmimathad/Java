package com.xworkz.cupboardapp;

import com.xworkz.cupboardapp.cupboard.CupBoard;
import com.xworkz.cupboardapp.impl.WoodenCupBoardImpl;

public class CupBoardRunner {
    public static void main(String[] args) {
        CupBoard cupBoard=new WoodenCupBoardImpl();
        cupBoard.open();
        cupBoard.close();
        cupBoard.lock();
    }
}

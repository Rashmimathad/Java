package com.xworkz.refreeapp;

import com.xworkz.refreeapp.impl.FootBallRefreeImpl;
import com.xworkz.refreeapp.refree.Refree;

public class RefreeRunner {
    public static void main(String[] args) {
        Refree refree=new FootBallRefreeImpl();
        refree.startMatch();
        refree.giveDecision();
        refree.stopMatch();
    }
}

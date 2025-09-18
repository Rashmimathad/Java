package com.xworkz.refreeapp.impl;

import com.xworkz.refreeapp.refree.Refree;

public class FootBallRefreeImpl implements Refree {
    @Override
    public void startMatch() {
        System.out.println("Football refree starts the football match");
    }

    @Override
    public void stopMatch() {
        System.out.println("Football refree stops the football match");
    }

    @Override
    public void giveDecision() {
        System.out.println("Football refree gives decision in the football match");
    }
}

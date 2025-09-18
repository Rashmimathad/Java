package com.xworkz.gameapp.impl;

import com.xworkz.gameapp.game.Game;

public class TempleRunImpl implements Game {
    @Override
    public void play() {
        System.out.println("Playing temple run game");
    }

    @Override
    public void end() {
        System.out.println("Temple run game ended");
    }

    @Override
    public void start() {
        System.out.println("Temple run game started");
    }
}

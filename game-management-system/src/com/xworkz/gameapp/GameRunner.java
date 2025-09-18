package com.xworkz.gameapp;

import com.xworkz.gameapp.game.Game;
import com.xworkz.gameapp.impl.TempleRunImpl;

public class GameRunner {
    public static void main(String[] args) {
        Game game=new TempleRunImpl();
        game.start();
        game.play();
        game.end();
    }
}

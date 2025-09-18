package com.xworkz.planetapp.impl;

import com.xworkz.planetapp.planet.Planet;

public class EarthImpl implements Planet {
    @Override
    public void rotate() {
        System.out.println("Earth planet rotated");
    }

    @Override
    public void revolve() {
        System.out.println("Earth planet revolving");
    }

    @Override
    public boolean isSupportLife() {
        return true;
    }
}

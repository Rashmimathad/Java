package com.xworkz.planetapp;

import com.xworkz.planetapp.impl.EarthImpl;
import com.xworkz.planetapp.planet.Planet;

public class PlanetRunner {
    public static void main(String[] args) {
        Planet planet=new EarthImpl();
        planet.rotate();
        planet.revolve();
        System.out.println("Is Earth planet support life? "+planet.isSupportLife());
    }
}

package com.xworkz.seedapp;

import com.xworkz.seedapp.impl.ChilliSeedImpl;
import com.xworkz.seedapp.seed.Seed;

public class SeedRunner {
    public static void main(String[] args) {
        Seed seed=new ChilliSeedImpl();
        seed.germinate();
        seed.growRoot();
        seed.sproutLeaf();
    }
}

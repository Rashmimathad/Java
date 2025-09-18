package com.xworkz.seedapp.impl;

import com.xworkz.seedapp.seed.Seed;

public class ChilliSeedImpl implements Seed {
    @Override
    public void germinate() {
        System.out.println("Chilli Seed Germinated");
    }

    @Override
    public void growRoot() {
        System.out.println("Roots grown from Chilli seed");
    }

    @Override
    public void sproutLeaf() {
        System.out.println("Leafs Sprouted from Chilli seed");
    }
}

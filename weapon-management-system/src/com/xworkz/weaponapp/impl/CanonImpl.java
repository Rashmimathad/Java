package com.xworkz.weaponapp.impl;

import com.xworkz.weaponapp.weapon.Weapon;

public class CanonImpl implements Weapon {
    @Override
    public void load() {
        System.out.println("Canon weapon loaded");
    }

    @Override
    public void reLoad() {
        System.out.println("Canon weapon re-loaded");
    }

    @Override
    public void fire() {
        System.out.println("Canon weapon fired");
    }
}

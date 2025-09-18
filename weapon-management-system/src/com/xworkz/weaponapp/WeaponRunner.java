package com.xworkz.weaponapp;

import com.xworkz.weaponapp.impl.CanonImpl;
import com.xworkz.weaponapp.weapon.Weapon;

public class WeaponRunner {
    public static void main(String[] args) {
        Weapon weapon=new CanonImpl();
        weapon.load();
        weapon.fire();
        weapon.reLoad();
    }
}

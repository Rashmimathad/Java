package com.xworkz.passportapp.impl;

import com.xworkz.passportapp.passport.Passport;

import java.util.Set;

public  class RegularPassportImpl implements Passport {

    @Override
    public void apply() {
        System.out.println("Regular passport applied");
    }

    @Override
    public void renew() {
        System.out.println("Regular passport renewed");
    }

    @Override
    public void validate() {
        System.out.println("Regular passport validated");
    }
}

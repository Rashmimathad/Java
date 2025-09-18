package com.xworkz.passportapp;

import com.xworkz.passportapp.impl.RegularPassportImpl;
import com.xworkz.passportapp.passport.Passport;

public class PassportRunner {
    public static void main(String[] args) {

        Passport passport=new RegularPassportImpl();

        passport.apply();
        passport.validate();
        passport.renew();
        
    }
}

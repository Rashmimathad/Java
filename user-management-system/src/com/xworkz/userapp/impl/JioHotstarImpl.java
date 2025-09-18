package com.xworkz.userapp.impl;

import com.xworkz.userapp.user.User;

public class JioHotstarImpl implements User {
    @Override
    public void register() {
        System.out.println("JioHotstar user registered");
    }

    @Override
    public void logIn() {
        System.out.println("JioHotstar user logged In");
    }

    @Override
    public void logOut() {
        System.out.println("JioHotstar user logged Out");
    }
}

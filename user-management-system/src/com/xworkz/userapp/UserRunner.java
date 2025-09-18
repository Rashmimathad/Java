package com.xworkz.userapp;

import com.xworkz.userapp.impl.JioHotstarImpl;
import com.xworkz.userapp.user.User;

public class UserRunner {
    public static void main(String[] args) {
        User user=new JioHotstarImpl();
        user.register();
        user.logIn();
        user.logOut();
    }
}

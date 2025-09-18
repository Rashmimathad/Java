package com.xworkz.profileapp;

import com.xworkz.profileapp.impl.WorkProfileImpl;
import com.xworkz.profileapp.profile.Profile;

public class ProfileRunner {
    public static void main(String[] args) {
        Profile profile=new WorkProfileImpl();
        profile.view();
        profile.edit();
        profile.delete();
    }
}

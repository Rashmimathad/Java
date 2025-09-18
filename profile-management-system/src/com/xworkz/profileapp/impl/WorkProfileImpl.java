package com.xworkz.profileapp.impl;

import com.xworkz.profileapp.profile.Profile;

public class WorkProfileImpl implements Profile {
    @Override
    public void view() {
        System.out.println("Work profile viewed");
    }

    @Override
    public void edit() {
        System.out.println("Work profile edited");
    }

    @Override
    public void delete() {
        System.out.println("Work profile deleted");
    }
}

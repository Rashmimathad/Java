package com.xworkz.developerapp.impl;

import com.xworkz.developerapp.developer.Developer;

public class JavaDeveloperImpl implements Developer {
    @Override
    public void code() {
        System.out.println("Java Developer is coding");
    }

    @Override
    public void debug() {
        System.out.println("Java Developer is debugging the code");
    }

    @Override
    public void deploy() {
        System.out.println("Java Developer is deploying the code");
    }
}

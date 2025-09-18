package com.xworkz.jarapp.impl;

import com.xworkz.jarapp.jar.Jar;

public class CookieJarImpl implements Jar {
    @Override
    public void store() {
        System.out.println("Cookies are stored in cookie Jar");
    }

    @Override
    public void sealJar() {
        System.out.println("Cookie Jar sealed");
    }

    @Override
    public void openJar() {
        System.out.println("Cookie jar Opened");
    }
}

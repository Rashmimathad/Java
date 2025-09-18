package com.xworkz.jarapp;

import com.xworkz.jarapp.impl.CookieJarImpl;
import com.xworkz.jarapp.jar.Jar;

public class JarRunner {
    public static void main(String[] args) {
        Jar jar=new CookieJarImpl();
        jar.store();
        jar.openJar();
        jar.sealJar();
    }
}

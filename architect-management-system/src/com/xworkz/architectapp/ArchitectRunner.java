package com.xworkz.architectapp;

import com.xworkz.architectapp.architect.Architect;
import com.xworkz.architectapp.impl.InteriorArchitectImpl;

public class ArchitectRunner {
    public static void main(String[] args) {
        Architect architect=new InteriorArchitectImpl();
        architect.plan();
        architect.draw();
        architect.supervise();
    }
}

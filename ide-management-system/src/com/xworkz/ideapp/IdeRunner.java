package com.xworkz.ideapp;

import com.xworkz.ideapp.ide.Ide;
import com.xworkz.ideapp.impl.IntellijImpl;

public class IdeRunner {
    public static void main(String[] args) {
        Ide ide=new IntellijImpl();
        ide.compileCode();
        ide.executesCode();
        ide.debugCode();
    }
}

package com.xworkz.ideapp.impl;

import com.xworkz.ideapp.ide.Ide;

public class IntellijImpl  implements Ide {
    @Override
    public void compileCode() {
        System.out.println("IntelliJ compiles code");
    }

    @Override
    public void executesCode() {
        System.out.println("IntelliJ executes code");
    }

    @Override
    public void debugCode() {
        System.out.println("IntelliJ debugs code");
    }
}

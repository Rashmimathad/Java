package com.xworkz.buttonapp;

import com.xworkz.buttonapp.button.Button;
import com.xworkz.buttonapp.impl.MobileImpl;

public class ButtonRunner {
    public static void main(String[] args) {
        Button button=new MobileImpl();
        button.press();
        button.release();
        button.hold();
    }
}

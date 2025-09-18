package com.xworkz.buttonapp.impl;

import com.xworkz.buttonapp.button.Button;

public class MobileImpl implements Button {
    @Override
    public void press() {
        System.out.println("Mobile Power On");
    }

    @Override
    public void release() {
        System.out.println("Mobile Power On");
    }

    @Override
    public void hold() {
        System.out.println("Mobile is restarting");
    }
}

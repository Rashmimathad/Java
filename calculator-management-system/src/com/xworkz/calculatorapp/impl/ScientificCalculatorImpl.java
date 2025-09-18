package com.xworkz.calculatorapp.impl;

import com.xworkz.calculatorapp.calculator.Calculator;

public class ScientificCalculatorImpl implements Calculator {
    @Override
    public void on() {
        System.out.println("Scientific calculator turned On");
    }

    @Override
    public void off() {
        System.out.println("Scientific calculator turned Off");
    }

    @Override
    public void calculate() {
        System.out.println("Scientific calculator started calculation");
    }
}

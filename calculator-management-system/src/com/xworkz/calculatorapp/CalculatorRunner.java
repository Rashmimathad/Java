package com.xworkz.calculatorapp;

import com.xworkz.calculatorapp.calculator.Calculator;
import com.xworkz.calculatorapp.impl.ScientificCalculatorImpl;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator=new ScientificCalculatorImpl();
        calculator.on();
        calculator.calculate();
        calculator.off();
    }
}

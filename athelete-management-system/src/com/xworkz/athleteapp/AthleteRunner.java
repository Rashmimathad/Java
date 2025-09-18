package com.xworkz.athleteapp;

import com.xworkz.athleteapp.athlete.Athlete;
import com.xworkz.athleteapp.impl.CricketerImpl;

public class AthleteRunner {
    public static void main(String[] args) {
        Athlete athlete=new CricketerImpl();
        athlete.train();
        athlete.compete();
        athlete.recover();
    }
}

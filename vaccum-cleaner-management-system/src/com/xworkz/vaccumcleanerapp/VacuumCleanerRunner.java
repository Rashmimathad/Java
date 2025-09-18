package com.xworkz.vaccumcleanerapp;

import com.xworkz.vaccumcleanerapp.impl.RobotCleanerImpl;
import com.xworkz.vaccumcleanerapp.vacuumcleaner.VacuumCleaner;

public class VacuumCleanerRunner {
    public static void main(String[] args) {
        VacuumCleaner vacuumCleaner=new RobotCleanerImpl();
        vacuumCleaner.startCleaning();
        vacuumCleaner.stopCleaning();
        vacuumCleaner.emptyDust();
    }
}

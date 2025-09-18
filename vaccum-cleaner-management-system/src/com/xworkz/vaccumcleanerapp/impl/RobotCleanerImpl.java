package com.xworkz.vaccumcleanerapp.impl;

import com.xworkz.vaccumcleanerapp.vacuumcleaner.VacuumCleaner;

public class RobotCleanerImpl implements VacuumCleaner {
    @Override
    public void startCleaning() {
        System.out.println("Robot cleaner started cleaning");
    }

    @Override
    public void stopCleaning() {
        System.out.println("Robot cleaner stopped cleaning");
    }

    @Override
    public void emptyDust() {
        System.out.println("Robot cleaner empty dust");
    }
}

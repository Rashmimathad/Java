package com.xworkz.universityapp.impl;

import com.xworkz.universityapp.university.University;

public class AutonomousUniversityImpl implements University {
    @Override
    public void enrollStudent() {
        System.out.println("Student enrolled in Autonomous university");
    }

    @Override
    public void conductExam() {
        System.out.println("exams conducted in Autonomous university");
    }

    @Override
    public void grantDegree() {
        System.out.println("Autonomous university grant degree");
    }
}

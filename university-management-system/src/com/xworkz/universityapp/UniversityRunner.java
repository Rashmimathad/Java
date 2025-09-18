package com.xworkz.universityapp;

import com.xworkz.universityapp.impl.AutonomousUniversityImpl;
import com.xworkz.universityapp.university.University;

public class UniversityRunner {
    public static void main(String[] args) {
        University university=new AutonomousUniversityImpl();
        university.enrollStudent();
        university.conductExam();
        university.grantDegree();
    }
}

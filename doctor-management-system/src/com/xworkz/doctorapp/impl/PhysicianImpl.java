package com.xworkz.doctorapp.impl;

import com.xworkz.doctorapp.doctor.Doctor;

public class PhysicianImpl implements Doctor {

    @Override
    public void diagnose() {
        System.out.println("Physician diagnose the patient");
    }

    @Override
    public void treat() {
        System.out.println("Physician treat the patient");
    }

    @Override
    public void prescribe() {
        System.out.println("Physician prescribe the medicine for patient");
    }
}

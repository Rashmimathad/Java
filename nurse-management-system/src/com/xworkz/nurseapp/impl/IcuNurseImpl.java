package com.xworkz.nurseapp.impl;

import com.xworkz.nurseapp.nurse.Nurse;

public class IcuNurseImpl implements Nurse {
    @Override
    public void assist() {
        System.out.println("Icu Nurse assists the chief doctor");
    }

    @Override
    public void monitor() {
        System.out.println("Icu Nurse monitor the vitals of patient in ICU");
    }

    @Override
    public void care() {
        System.out.println("Icu Nurse takes care of the patient in ICU");
    }
}

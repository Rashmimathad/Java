package com.xworkz.hospitalapp.impl;

import com.xworkz.hospitalapp.hospital.Hospital;

public class MultiSpecialityHospitalImpl implements Hospital {
    @Override
    public void admitPatient() {
        System.out.println("Patient admitted in Multi-speciality hospital");
    }

    @Override
    public void dischargePatient() {
        System.out.println("Patient discharged from Multi-speciality hospital");
    }

    @Override
    public void treatPatient() {
        System.out.println("Patient treated in Multi-speciality hospital");
    }
}

package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.impl.MultiSpecialityHospitalImpl;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital=new MultiSpecialityHospitalImpl();
        hospital.admitPatient();
        hospital.treatPatient();
        hospital.dischargePatient();
    }
}

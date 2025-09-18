package com.xworkz.doctorapp;

import com.xworkz.doctorapp.doctor.Doctor;
import com.xworkz.doctorapp.impl.PhysicianImpl;


public class DoctorRunner {
    public static void main(String[] args) {
        Doctor doctor=new PhysicianImpl();
        doctor.diagnose();
        doctor.treat();
        doctor.prescribe();
    }
}

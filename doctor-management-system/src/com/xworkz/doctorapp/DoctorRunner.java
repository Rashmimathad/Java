package com.xworkz.doctorapp;

import com.xworkz.doctorapp.doctor.Doctor;
import com.xworkz.doctorapp.surgeon.Surgeon;

public class DoctorRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Doctor doctorOne=new Surgeon();
        doctorOne.doctor();
        System.out.println("main ended");
    }
}

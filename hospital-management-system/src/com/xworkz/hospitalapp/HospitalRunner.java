package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        System.out.println();

        Patient patientOne = new Patient();
        patientOne.setPatientId(1);
        patientOne.setPatientName("M Rashmi");
        patientOne.setGender('F');
        patientOne.setPhoneNo(9019184800L);
        patientOne.setAddress("Rajajinagar,Bengaluru");
        patientOne.setInchargeDoctorName("Dr.Jagadeesh Kumar");

        Hospital hospital = new Hospital();
        boolean patientAdded =   hospital.addPatient(patientOne);
        System.out.println("Is Patient added : "+patientAdded);

        if(patientAdded){
            hospital.getPatientDetails();
        }

        System.out.println();
        System.out.println("main ended");
    }
}

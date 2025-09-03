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

        Patient patientTwo = new Patient();
        patientTwo.setPatientId(2);
        patientTwo.setPatientName("Inchara Y S");
        patientTwo.setGender('F');
        patientTwo.setPhoneNo(8431101915L);
        patientTwo.setAddress("Vijayanagar,Bengaluru");
        patientTwo.setInchargeDoctorName("Dr.Chandana");

        Patient patientThree = new Patient();
        patientThree.setPatientId(3);
        patientThree.setPatientName("K Lavanya");
        patientThree.setGender('F');
        patientThree.setPhoneNo(8217402336L);
        patientThree.setAddress("Gandhinagar,Ballari");
        patientThree.setInchargeDoctorName("Dr.Yogananda Reddy");

        Hospital hospital = new Hospital();
        System.out.println("Is Patient One added : "+hospital.addPatient(patientOne));
        System.out.println("Is Patient Two added : "+hospital.addPatient(patientTwo));
        System.out.println("Is Patient Three added : "+hospital.addPatient(patientThree));

        System.out.println();
        hospital.getAllPatientsDetails();

        System.out.println();
        System.out.println("main ended");
    }
}

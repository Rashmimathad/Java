package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class HospitalRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        System.out.println();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of patients to be added : ");
        int size=sc.nextInt();
        Hospital hospital=new Hospital(size);

        for (int i = 0; i <size; i++) {
            Patient patient=new Patient();
            System.out.println("Enter patient "+(i+1)+" details : ");

            System.out.print("Enter the Patient Id : ");
            patient.setPatientId(sc.nextInt());

            System.out.print("Enter the patient name : ");sc.nextLine();
            patient.setPatientName(sc.nextLine());

            System.out.print("Enter the gender of the Patient : ");
            patient.setGender(Gender.valueOf(sc.next().toUpperCase()));

            System.out.print("Enter the phone number of the patient : ");
            patient.setPhoneNo(sc.nextLong());

            System.out.print("Enter the Address of the patient : ");sc.nextLine();
            patient.setAddress(sc.nextLine());

            System.out.print("Enter the Incharge doctor name : ");
            patient.setInchargeDoctorName(sc.nextLine());

            hospital.addPatient(patient);
            System.out.println();
            System.out.println("Number of patients left to add : "+(size-(i+1)));
        }
    /*    Patient patientOne = new Patient();
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
        System.out.println("Is Patient Three added : "+hospital.addPatient(patientThree));*/


        System.out.println();
        hospital.getAllPatientsDetails();

        System.out.println();
        System.out.print("Enter the Id to get Patient name : ");
        System.out.println(hospital.getPatientNameById(sc.nextInt()));

        System.out.println();
        System.out.print("Enter the patient Id and doctor name to update incharge doctor name : ");
        hospital.updateInchargeDoctorNameById(sc.nextInt(),sc.nextLine());

        System.out.println();
        System.out.print("Enter the patient Id to get Patient Info : ");
        hospital.displayPatientInfo(hospital.getPatientInfoById(sc.nextInt()));

        System.out.println();
        System.out.print("Enter the patient Id to be deleted : ");
        hospital.deletedPatientById(sc.nextInt());

        System.out.println();
        System.out.println("main ended");
    }
}

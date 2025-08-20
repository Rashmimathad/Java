package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.validator.PatientValidator;

public class Hospital {
    Patient patient;

    public boolean addPatient(Patient patient){
        boolean isPatientAdded=false;

        PatientValidator validatePatient= new PatientValidator();
        boolean isPatientInfoValid=validatePatient.validatePatientInfo(patient);

        if(isPatientInfoValid){
            this.patient=patient;
            isPatientAdded=true;
        }
        return isPatientAdded;
    }

    public void getPatientDetails(){
        System.out.println("Patient Id is : "+patient.getPatientId());
        System.out.println("Patient Name is : "+patient.getPatientName());
        System.out.println("Patient gender is : "+patient.getGender());
        System.out.println("Patient Phone number is : "+patient.getPhoneNo());
        System.out.println("Patient's address is : "+patient.getAddress());
        System.out.println("Incharge doctor of the patient is : "+patient.getInchargeDoctorName());
    }
}

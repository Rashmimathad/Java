package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.validator.PatientValidator;

public class Hospital {
    Patient[] patients = new Patient[3];
    int index;

    public boolean addPatient(Patient patient){
        boolean isPatientAdded=false;

        PatientValidator validatePatient= new PatientValidator();
        if(patient!=null && validatePatient.validatePatientInfo(patient)){
            patients[index++]=patient;
            isPatientAdded=true;
        }
        return isPatientAdded;
    }

    public void getAllPatientsDetails(){
        System.out.println("All Patients Details of the hospital are :");
        System.out.println();
        for (Patient patient : patients) {
            System.out.println("Patient Id is : " + patient.getPatientId());
            System.out.println("Patient Name is : " + patient.getPatientName());
            System.out.println("Patient gender is : " + patient.getGender());
            System.out.println("Patient Phone number is : " + patient.getPhoneNo());
            System.out.println("Patient's address is : " + patient.getAddress());
            System.out.println("Incharge doctor of the patient is : " + patient.getInchargeDoctorName());
            System.out.println("--------------------------------------------------------------------------");
        }
    }
}

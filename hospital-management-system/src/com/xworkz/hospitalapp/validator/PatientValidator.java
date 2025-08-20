package com.xworkz.hospitalapp.validator;

import com.xworkz.hospitalapp.patient.Patient;

public class PatientValidator {

    Patient patient;

    public boolean validatePatientInfo(Patient patient) {
        boolean isPatientValidated = false;
        boolean isPatientIdValid = false;
        boolean isPatientNameValid = false;
        boolean isPatientGenderValid = false;
        boolean isPatientPhoneNoValid = false;
        boolean isPatientAddressValid = false;
        boolean isInchargeDoctorNameValid = false;

        if (patient.getPatientId() != 0)
            isPatientIdValid = true;
        else System.out.println("Invalid patient Id");

        if (patient.getPatientName() != null && !patient.getPatientName().isEmpty())
            isPatientNameValid = true;
        else System.out.println("Invalid Patient name");

        if (patient.getGender() != ' ')
            isPatientGenderValid = true;
        else System.out.println("Invalid patient gender");

        if (patient.getPhoneNo() != 0)
            isPatientPhoneNoValid = true;
        else System.out.println("Invalid Phone number");

        if (patient.getAddress() != null && !patient.getAddress().isEmpty())
            isPatientAddressValid = true;
        else System.out.println("Invalid address");

        if (patient.getInchargeDoctorName() != null && !patient.getInchargeDoctorName().isEmpty())
            isInchargeDoctorNameValid = true;
        else System.out.println("Invalid Incharge doctor name");

        if (isPatientIdValid && isPatientNameValid && isPatientGenderValid && isPatientPhoneNoValid && isPatientAddressValid && isInchargeDoctorNameValid){
            isPatientValidated = true;
         }
        return isPatientValidated;
    }

}

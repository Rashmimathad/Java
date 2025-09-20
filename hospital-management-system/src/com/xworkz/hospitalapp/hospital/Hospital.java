package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public interface Hospital {
    boolean addPatient(Patient patient);
    Patient getPatientInfoById(int patientId);
    void displayPatientInfo(Patient patient);
    String getPatientNameById(int patientId);
    String getAddressByPatientId(int patientId);
    long getPhoneNumberById(int patientId);
    Gender getGenderById(int patientId);
    boolean deletePatientById(int patientId);
    boolean updateInchargeDoctorNameById(int patientId,String upadtedInchargeDoctorName);
    void getAllPatientsDetails();

}

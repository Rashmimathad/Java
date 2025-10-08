package com.xworkz.hospitalapp.impl;

import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.validator.PatientValidator;

public class ApolloHospitalImpl implements Hospital {
    public Patient[] patients;
    int index;

    public ApolloHospitalImpl(int size){
        this.patients=new Patient[size];
    }

    @Override
    public boolean addPatient(Patient patient){
        boolean isPatientAdded=false;

        PatientValidator validatePatient= new PatientValidator();
        if(patient!=null && validatePatient.validatePatientInfo(patient)){
            patients[index++]=patient;
            isPatientAdded=true;
        }
        return isPatientAdded;
    }


    @Override
    public Patient getPatientInfoById(int patientId){
        Patient patient=null;
        for (Patient patient1:patients){
            if (patient1.getPatientId()==patientId){
                patient=patient1;
            }
        }
        if (patient!=null) return patient;
        else System.out.println("Patient with Id "+patientId+" not found");
        return null;
    }

    @Override
    public void displayPatientInfo(Patient patient){
        if (patient != null) {
            System.out.println("Patient Id is : " + patient.getPatientId());
            System.out.println("Patient Name is : " + patient.getPatientName());
            System.out.println("Patient gender is : " + patient.getGender());
            System.out.println("Patient Phone number is : " + patient.getPhoneNo());
            System.out.println("Patient's address is : " + patient.getAddress());
            System.out.println("Incharge doctor of the patient is : " + patient.getInchargeDoctorName());
            System.out.println("--------------------------------------------------------------------------");
        }
    }

    @Override
    public  String getPatientNameById(int patientId){
        for (Patient patient:patients){
            if (patient.getPatientId()==patientId){
                return "The name of patient with Id "+patientId+" is : "+patient.getPatientName();
            }
        }
        return "Patient with Id "+patientId+" not found";
    }

    @Override
    public String getAddressByPatientId(int patientId){
        for (Patient patient:patients){
            if (patient.getPatientId()==patientId){
                return "The address of patient with id "+patientId+" is : "+patient.getAddress();
            }
        }
        return "Patient wth Id "+patientId+" not found";
    }

    @Override
    public long getPhoneNumberById(int patientId){
        for (Patient patient:patients){
            if (patient.getPatientId()==patientId){
                return patient.getPhoneNo();
            }
        }
        return 0;
    }

    @Override
    public Gender getGenderById(int patientId){
        for (Patient patient:patients){
            if (patient.getPatientId()==patientId){
                return patient.getGender();
            }
        }
        return null;
    }

    @Override
    public boolean deletePatientById(int patientId){
        boolean isPatientDeleted=false;
        int length=patients.length;
        for (int i = 0; i <patients.length ; i++) {
            if (patients[i].getPatientId()==patientId){
                for (int j=i;j<patients.length-1;j++){
                    patients[j]=patients[j+1];
                }
                patients[patients.length-1]=null;
                length--;
                isPatientDeleted=true;
                break;
            }
        }
        if (isPatientDeleted!=false) System.out.println("Patient wth Id "+patientId+" is deleted");
        else System.out.println("Patient with Id "+patientId+" not found");
        return isPatientDeleted;
    }

    @Override
    public boolean updateInchargeDoctorNameById(int patientId,String upadtedInchargeDoctorName){
        boolean isPatientUpdated=false;
        for (Patient patient:patients){
            if (patient.getPatientId()==patientId){
                patient.setInchargeDoctorName(upadtedInchargeDoctorName);
                isPatientUpdated=true;
            }

        }
        if (isPatientUpdated!=false) System.out.println("The updated incharge doctor name for the patient with id "+patientId+" is : "+upadtedInchargeDoctorName);
        else System.out.println("Patient with Id "+patientId+" not found");
        return isPatientUpdated;
    }

    @Override
    public void getAllPatientsDetails(){
        System.out.println("All Patients Details of the hospital are :");
        System.out.println();
        for (Patient patient : patients) {
            if (patient != null) {
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
}

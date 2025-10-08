package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    private int patientId;
    private String patientName;
    private Gender gender;
    private long phoneNo;
    private String address;
    private String inchargeDoctorName;

    @Override
    public  String toString(){
        return "Patient = {patientId= "+this.patientId+", patientName= "+this.patientName+", gender= "+this.gender+", phoneNo= "+this.phoneNo+", address= "+this.address+", inchargeDoctorName= "+this.inchargeDoctorName+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Patient){
            Patient patient=(Patient) o;
            if (this.patientId==patient.patientId&&this.patientName.equals(patient.patientName)&&this.gender.equals(patient.gender)&&this.phoneNo==patient.phoneNo&&this.address.equals(patient.address)&&this.inchargeDoctorName.equals(patient.inchargeDoctorName))
                return true;
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, patientName, gender, phoneNo, address, inchargeDoctorName);
    }


    //    public void setPatientId(int patientId){
//        this.patientId=patientId;
//    }
//
//    public void setPatientName(String patientName){
//        this.patientName=patientName;
//    }
//
//    public void setGender(char gender){
//        this.gender=gender;
//    }
//
//    public void setPhoneNo(long phoneNo){
//        this.phoneNo=phoneNo;
//    }
//
//    public void setAddress(String address){
//        this.address=address;
//    }
//
//    public void setInchargeDoctorName(String inchargeDoctorName){
//        this.inchargeDoctorName=inchargeDoctorName;
//    }
//
//    public int getPatientId(){
//        return patientId;
//    }
//
//    public String getPatientName(){
//        return patientName;
//    }
//
//    public char getGender(){
//        return gender;
//    }
//
//    public long getPhoneNo(){
//        return phoneNo;
//    }
//
//    public String getAddress(){
//        return address;
//    }
//
//    public String getInchargeDoctorName(){
//        return inchargeDoctorName;
//    }
}

package com.xworkz.patientapp.patient;

import com.xworkz.patientapp.constant.BloodGroup;
import com.xworkz.patientapp.constant.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Patient {
    private int patientId;
    private String patientName;
    private int patientAge;
    private String patientAddress;
    private Gender gender;
    private BloodGroup bloodGroup;
    private String diseaseName;

    @Override
    public String toString() {
        return "Patient = {patientId = "+patientId+",patientName = "+patientName+",patientAge = "+patientAge+",patientAddress = "+patientAddress+",gender = "+gender+",bloodGroup = "+bloodGroup+",diseaseName = "+diseaseName+"}";
    }

}

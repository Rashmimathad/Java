package com.xworkz.doctorapp.doctor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Doctor {
    private int doctorId;
    private String doctorName;
    private String specialization;
    private int yearsOfExperience;
    private int noOfAppointmentsPerDay;
    private int workingHours;

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", noOfAppointmentsPerDay=" + noOfAppointmentsPerDay +
                ", workingHours=" + workingHours +
                '}';
    }
}

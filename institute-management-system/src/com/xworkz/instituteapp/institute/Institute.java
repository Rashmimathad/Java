package com.xworkz.instituteapp.institute;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Institute {

    private int instituteId;
    private String instituteName;
    private String instituteLocation;
    private int noOfTrainees;
    private int noOfCourses;
    private int noOfTrainers;

    @Override
    public String toString() {
        return "Institute{" +
                "instituteId=" + instituteId +
                ", instituteName='" + instituteName + '\'' +
                ", instituteLocation='" + instituteLocation + '\'' +
                ", noOfTrainees=" + noOfTrainees +
                ", noOfCourses=" + noOfCourses +
                ", noOfTrainers=" + noOfTrainers +
                '}';
    }
}

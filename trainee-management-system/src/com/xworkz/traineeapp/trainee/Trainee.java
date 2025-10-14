package com.xworkz.traineeapp.trainee;

import com.xworkz.traineeapp.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Trainee {
    private int traineeId;
    private String traineeName;
    private int traineeAge;
    private Gender gender;
    private String address;
    private String courseName;
    private int termOfCourseInMonths;

    @Override
    public String toString(){
        return "Trainee = {traineeId = "+traineeId+",traineeName = "+traineeName+",traineeAge = "+traineeAge+",gender = "+gender+",address = "+address+",courseName = "+courseName+",termOfCourseInMonths = "+termOfCourseInMonths+"}";
    }
}

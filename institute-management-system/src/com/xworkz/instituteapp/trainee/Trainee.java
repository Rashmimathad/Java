package com.xworkz.instituteapp.trainee;

import com.xworkz.instituteapp.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trainee {

    private int traineeId;
    private String traineeName;
    private Gender gender;
    private long phoneNo;
    private String courseEnrolled;
    private int termOfCourse;

//    public void setTraineeId(int traineeId) {
//        this.traineeId = traineeId;
//    }
//
//    public void setTraineeName(String traineeName) {
//        this.traineeName = traineeName;
//    }
//
//    public void setGender(char gender) {
//        this.gender = gender;
//    }
//
//    public void setPhoneNo(long phoneNo) {
//        this.phoneNo = phoneNo;
//    }
//
//    public void setCourseEnrolled(String courseEnrolled) {
//        this.courseEnrolled = courseEnrolled;
//    }
//
//    public void setTermOfCourse(int termOfCourse) {
//        this.termOfCourse = termOfCourse;
//    }
//
//    public int getTraineeId(){
//        return traineeId;
//    }
//
//    public String getTraineeName(){
//        return traineeName;
//    }
//
//    public char getGender() {
//        return gender;
//    }
//
//    public long getPhoneNo() {
//        return phoneNo;
//    }
//
//    public String getCourseEnrolled() {
//        return courseEnrolled;
//    }
//
//    public int getTermOfCourse() {
//        return termOfCourse;
//    }
}

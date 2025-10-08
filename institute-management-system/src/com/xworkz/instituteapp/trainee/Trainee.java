package com.xworkz.instituteapp.trainee;

import com.xworkz.instituteapp.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Trainee = { traineeId= "+this.traineeId+", traineeName= "+this.traineeName+", gender= "+this.gender+", phoneNo= "+this.phoneNo+
                ", courseEnrolled= "+this.courseEnrolled+", termOfCourse= "+this.termOfCourse+"}";
    }

    @Override
    public  int hashCode(){
        return Objects.hash(traineeId,traineeName,gender,phoneNo,courseEnrolled,termOfCourse);
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Trainee){
            Trainee trainee=(Trainee) obj;
            if (this.traineeId==trainee.traineeId && this.traineeName.equals(trainee.traineeName) && this.gender.equals(trainee.gender) && this.phoneNo==trainee.phoneNo &&this.courseEnrolled.equals(trainee.courseEnrolled)&& this.termOfCourse==trainee.termOfCourse)
                return true;
            return false;
        }
        return false;
    }

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

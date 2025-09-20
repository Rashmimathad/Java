package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.constants.Gender;
import com.xworkz.instituteapp.trainee.Trainee;

public interface Institute {
    boolean addTrainee(Trainee trainee);
    boolean deleteTraineeById(int traineeId);
    String getTraineeNameById(int traineeId);
    Gender getGenderByName(String traineeName);
    boolean updateTermOfCourseById(int traineeId,int updatedTermOfCourse);
    long getPhoneNumberById(int traineeId);
    Trainee getTraineeInfoById(int traineeId);
    void displayTraineeInfo(Trainee trainee);
    void getAllTraineesDetails();
}

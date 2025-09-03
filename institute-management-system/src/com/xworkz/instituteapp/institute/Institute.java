package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.validator.TraineeValidator;

public class Institute {
    Trainee[] trainees = new Trainee[15];
    int index;

    public boolean addTrainee(Trainee trainee){

        boolean isTraineeAdded=false;

        TraineeValidator validateTrainee=new TraineeValidator();
        if (trainee!=null && validateTrainee.validateTrainee(trainee)) {
            trainees[index++] = trainee;
            isTraineeAdded = true;
        }
        return isTraineeAdded;
    }

    public void getAllTraineesDetails(){
        System.out.println("All Trainee details are :");
        System.out.println();
        for (Trainee trainee : trainees) {
            System.out.println("Trainee Id is : " + trainee.getTraineeId());
            System.out.println("Trainee Name is : " + trainee.getTraineeName());
            System.out.println("Gender of trainee is : " + trainee.getGender());
            System.out.println("Trainee Phone number is : " + trainee.getPhoneNo());
            System.out.println("Course Enrolled by trainee is : " + trainee.getCourseEnrolled());
            System.out.println("Term of course is : " + trainee.getTermOfCourse() + " months");
            System.out.println("--------------------------------------------------------------------");
        }
    }
}

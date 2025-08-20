package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.validator.TraineeValidator;

public class Institute {
    Trainee trainee;

    public boolean addTrainee(Trainee trainee){

        boolean isTraineeAdded=false;

        TraineeValidator validateTrainee=new TraineeValidator();
        boolean isTraineeValidated=validateTrainee.validateTrainee(trainee);
        if (isTraineeValidated) {
            this.trainee = trainee;
            isTraineeAdded = true;
        }
        return isTraineeAdded;
    }

    public void getTraineeDetails(){
        System.out.println("Trainee Id is : "+trainee.getTraineeId());
        System.out.println("Trainee Name is : "+trainee.getTraineeName());
        System.out.println("Gender of trainee is : "+trainee.getGender());
        System.out.println("Trainee Phone number is : "+trainee.getPhoneNo());
        System.out.println("Course Enrolled by trainee is : "+trainee.getCourseEnrolled());
        System.out.println("Term of course is : "+trainee.getTermOfCourse()+" months");
    }
}

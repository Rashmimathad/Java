package com.xworkz.instituteapp.validator;

import com.xworkz.instituteapp.trainee.Trainee;

public class TraineeValidator {

    public boolean validateTrainee(Trainee trainee){
        boolean isTraineeValidated=false;
        boolean isTraineeIdValid=false;
        boolean isTraineeNameValid=false;
        boolean isGenderValid=false;
        boolean isPhoneNoValid=false;
        boolean isCourseEnrolledValid=false;
        boolean isTermOfCourseValid=false;

        if (trainee.getTraineeId()!=0)
            isTraineeIdValid=true;
        else System.out.println("Invalid Trainee Id");

        if (trainee.getTraineeName()!=null && !trainee.getTraineeName().isEmpty())
            isTraineeNameValid=true;
        else System.out.println("Invalid trainee name");

        if (trainee.getGender()!=' ')
            isGenderValid=true;
        else System.out.println("Invalid gender");

        if (trainee.getPhoneNo()!=0)
            isPhoneNoValid=true;
        else System.out.println("Invalid phone number");

        if (trainee.getCourseEnrolled()!=null && !trainee.getCourseEnrolled().isEmpty())
            isCourseEnrolledValid=true;
        else System.out.println("Invalid course");

        if (trainee.getTermOfCourse()!=0)
            isTermOfCourseValid=true;
        else System.out.println("Invalied term of course");

        if(isTraineeIdValid && isTraineeNameValid && isGenderValid && isPhoneNoValid && isCourseEnrolledValid && isTermOfCourseValid) {
            isTraineeValidated = true;
        }
        return isTraineeValidated;
    }
}

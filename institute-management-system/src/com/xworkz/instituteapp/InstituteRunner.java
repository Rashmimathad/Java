package com.xworkz.instituteapp;

import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.trainee.Trainee;

public class InstituteRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println();

        Trainee traineeOne = new Trainee();
        traineeOne.setTraineeId(101);
        traineeOne.setTraineeName("Rashmi");
        traineeOne.setGender('F');
        traineeOne.setPhoneNo(9019184800L);
        traineeOne.setCourseEnrolled("Java Full Stack Development");
        traineeOne.setTermOfCourse(6);

        Institute institute=new Institute();
        boolean isTraineeAdded=institute.addTrainee(traineeOne);
        System.out.println("Is Trainee Added? "+isTraineeAdded);

        if (isTraineeAdded)
            institute.getTraineeDetails();

        System.out.println();
        System.out.println("main ended");
    }
}

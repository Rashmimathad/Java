package com.xworkz.instituteapp.impl;

import com.xworkz.instituteapp.constants.Gender;
import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.validator.TraineeValidator;

public class XworkzImpl implements Institute {

    public XworkzImpl(int size){
        this.trainees=new Trainee[size];
    }

    public Trainee[] trainees;
    int index;

    @Override
    public boolean addTrainee(Trainee trainee){

        boolean isTraineeAdded=false;

        TraineeValidator validateTrainee=new TraineeValidator();
        if (trainee!=null && validateTrainee.validateTrainee(trainee)) {
            trainees[index++] = trainee;
            isTraineeAdded = true;
        }
        return isTraineeAdded;
    }

    @Override
    public boolean deleteTraineeById(int traineeId){
        boolean isTraineeDeleted=false;
        int length=trainees.length;
        for (int i = 0; i <trainees.length ; i++) {
            if (trainees[i].getTraineeId()==traineeId){
                for (int j=i;j<trainees.length-1;j++){
                    trainees[j]=trainees[j+1];
                }
                trainees[trainees.length-1]=null;
                length--;
                isTraineeDeleted=true;
                break;
            }
        }
        if (isTraineeDeleted!=false) System.out.println("Trainee with Id "+traineeId+" is deleted");
        else System.out.println("Trainee with Id "+traineeId+" not found");
        return isTraineeDeleted;
    }

    @Override
    public  String getTraineeNameById(int traineeId){
        for (Trainee trainee:trainees){
            if (trainee.getTraineeId()==traineeId)
                return "The name of the trainee with Id "+traineeId+" is : "+trainee.getTraineeName();
        }
        return "Trainee with Id "+traineeId+" not found!!";
    }

    public String getCourseEnrolledById(int traineeId){
        for (Trainee trainee:trainees){
            if (trainee.getTraineeId()==traineeId)
                return "The trainee with Id "+traineeId+" is enrolled for the course : "+trainee.getCourseEnrolled();
        }
        return "Trainee with Id "+traineeId+" not found!!";
    }

    @Override
    public Gender getGenderByName(String traineeName){
        for (Trainee trainee:trainees){
            if (trainee.getTraineeName().equalsIgnoreCase(traineeName)){
                return trainee.getGender();
            }
        }
        return null;
    }

    @Override
    public boolean updateTermOfCourseById(int traineeId,int updatedTermOfCourse){
        boolean isTermOfCourseUpdated=false;
        for (Trainee trainee:trainees){
            if (trainee.getTraineeId()==traineeId){
                trainee.setTermOfCourse(updatedTermOfCourse);
                isTermOfCourseUpdated=true;
            }
        }
        if (isTermOfCourseUpdated!=false) System.out.println("The term of course is updated to "+updatedTermOfCourse+" months for patient with Id "+traineeId);
        else System.out.println("Trainee with Id "+traineeId+" not found!!");
        return false;
    }

    @Override
    public long getPhoneNumberById(int traineeId){
        for (Trainee trainee:trainees){
            if (trainee.getTraineeId()==traineeId){
                return trainee.getPhoneNo();
            }
        }
        return 0;
    }

    @Override
    public Trainee getTraineeInfoById(int traineeId){
        Trainee trainee=null;
        for (Trainee trainee1:trainees){
            if (trainee1.getTraineeId()==traineeId){
                trainee=trainee1;
            }
        }
        if (trainee!=null) return trainee;
        else System.out.println("Trainee with Id "+traineeId+" not found!!");
        return null;
    }

@Override
    public void displayTraineeInfo(Trainee trainee){
        if (trainee!=null) {
            System.out.println("Trainee Id is : " + trainee.getTraineeId());
            System.out.println("Trainee Name is : " + trainee.getTraineeName());
            System.out.println("Gender of trainee is : " + trainee.getGender());
            System.out.println("Trainee Phone number is : " + trainee.getPhoneNo());
            System.out.println("Course Enrolled by trainee is : " + trainee.getCourseEnrolled());
            System.out.println("Term of course is : " + trainee.getTermOfCourse() + " months");
            System.out.println("--------------------------------------------------------------------");
        }
    }

    @Override
    public void getAllTraineesDetails(){
        System.out.println("All Trainee details are :");
        System.out.println();
        for (Trainee trainee : trainees) {
            if (trainee!=null) {
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
}

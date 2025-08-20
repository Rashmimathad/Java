package com.xworkz.trainingcentreapp;

import com.xworkz.trainingcentreapp.trainingcentre.TrainingCentre;

public class TrainingCentreRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        TrainingCentre trainingCentre = new TrainingCentre();
        trainingCentre.setTrainingCentreId(11);
        trainingCentre.setTrainingCentreName("X=Workz");
        trainingCentre.setOwnerName("Omkar");
        trainingCentre.setLocation("Bashyam Circle,Rajajinagar,Bengaluru");
        trainingCentre.setNoOfTrainees(60);
        trainingCentre.setNoOfTrainers(10);

        System.out.println("Training centre details : ");
        int trainingCentreId = trainingCentre.getTrainingCentreId();
        String trainingCentreName = trainingCentre.getTrainingCentreName();
        String ownerName = trainingCentre.getOwnerName();
        String location = trainingCentre.getLocation();
        int noOfTrainees = trainingCentre.getNoOfTrainees();
        int noOfTrainers = trainingCentre.getNoOfTrainers();

        System.out.println("Id of training centre is : "+trainingCentre.getTrainingCentreId());
        System.out.println("Name of the training centre is : "+trainingCentre.getTrainingCentreName());
        System.out.println("owner name of the training centre : "+trainingCentre.getOwnerName());
        System.out.println("location of the training centre is : "+trainingCentre.getLocation());
        System.out.println("no of trainees in the training centre are : "+trainingCentre.getNoOfTrainees());
        System.out.println("no of trainers in the training centre are : "+trainingCentre.getNoOfTrainers());
        System.out.println("main ended");
    }
}

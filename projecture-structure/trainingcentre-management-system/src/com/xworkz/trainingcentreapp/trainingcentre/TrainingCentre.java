package com.xworkz.trainingcentreapp.trainingcentre;

public class TrainingCentre {
    private int trainingCentreId;
    private String TrainingCentreName;
    private String ownerName;
    private String location;
    private int noOfTrainees;
    private int noOfTrainers;

    public int getTrainingCentreId() {
        return trainingCentreId;
    }

    public String getTrainingCentreName() {
        return TrainingCentreName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    public int getNoOfTrainees() {
        return noOfTrainees;
    }

    public int getNoOfTrainers() {
        return noOfTrainers;
    }

    public void setTrainingCentreId(int trainingCentreId) {
        this.trainingCentreId = trainingCentreId;
    }

    public void setTrainingCentreName(String trainingCentreName) {
        TrainingCentreName = trainingCentreName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNoOfTrainees(int noOfTrainees) {
        this.noOfTrainees = noOfTrainees;
    }

    public void setNoOfTrainers(int noOfTrainers) {
        this.noOfTrainers = noOfTrainers;
    }
}

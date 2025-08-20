package com.xworkz.templeapp.temple;

public class Temple {
    private String templeName;
    private String location;
    private String deity;
    private int noOfSteps;
    private String festivalsOrganized;
    private String managementAuthority;
    private int establishedYear;

    public String getTempleName(){
        return templeName;
    }

    public String getLocation(){
        return location;
    }

    public String getDeity(){
        return deity;
    }

    public int getNoOfSteps(){
        return noOfSteps;
    }

    public String getFestivalsOrganized(){
        return festivalsOrganized;
    }

    public String getManagementAuthority(){
        return managementAuthority;
    }

    public int getEstablishedYear(){
        return establishedYear;
    }

    public void setTempleName(String templeName) {
        this.templeName = templeName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDeity(String deity) {
        this.deity = deity;
    }

    public void setNoOfSteps(int noOfSteps) {
        this.noOfSteps = noOfSteps;
    }

    public void setFestivalsOrganized(String festivalsOrganized) {
        this.festivalsOrganized = festivalsOrganized;
    }

    public void setManagementAuthority(String managementAuthority) {
        this.managementAuthority = managementAuthority;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }
}

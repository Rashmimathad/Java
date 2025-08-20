package com.xworkz.loksabhaapp.politician;

public class Politician {
    private int politicianId;
    private String politicianName;
    private String designation;
    private String constituencyName;
    private int age;
    private int yearsInService;

    public void setPoliticianId(int politicianId) {
        this.politicianId = politicianId;
    }

    public void setPoliticianName(String politicianName) {
        this.politicianName = politicianName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setConstituencyName(String constituencyName) {
        this.constituencyName = constituencyName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearsInService(int yearsInService) {
        this.yearsInService = yearsInService;
    }

    public int getPoliticianId() {
        return politicianId;
    }

    public String getPoliticianName() {
        return politicianName;
    }

    public String getDesignation() {
        return designation;
    }

    public String getConstituencyName() {
        return constituencyName;
    }

    public int getAge() {
        return age;
    }

    public int getYearsInService() {
        return yearsInService;
    }
}

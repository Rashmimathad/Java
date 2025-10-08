package com.xworkz.loksabhaapp.politician;

import com.xworkz.loksabhaapp.constants.PoliticalParty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Politician {
    private int politicianId;
    private String politicianName;
    private String designation;
    private String constituencyName;
    private int age;
    private int yearsInService;
    private PoliticalParty politicalParty;

    @Override
    public String toString(){
        return "Politician = {politicianId= "+this.politicianId+", politicianName= "+this.politicianName+", designation= "+this.designation+", constituencyName= "+this.constituencyName+
    ", age= "+this.age+", yearsInService= "+this.yearsInService+", politicalParty= "+this.politicalParty+"}";
    }

    @Override
    public  int hashCode(){
        return Objects.hash(politicianId,politicianName,designation,constituencyName,age,yearsInService,politicalParty);
    }

    @Override
    public  boolean equals(Object obj){
        if (obj instanceof Politician){
            Politician politician=(Politician) obj;
            if (this.politicianId==politician.politicianId&& this.politicianName.equals(politician.politicianName)&& this.designation.equals(politician.designation)&& this.constituencyName.equals(politician.constituencyName)&& this.age==politician.age && this.yearsInService==politician.yearsInService&& this.politicalParty.equals(politician.politicalParty))
                return true;
            return false;
        }
        return false;
    }
//    public void setPoliticianId(int politicianId) {
//        this.politicianId = politicianId;
//    }
//
//    public void setPoliticianName(String politicianName) {
//        this.politicianName = politicianName;
//    }
//
//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }
//
//    public void setConstituencyName(String constituencyName) {
//        this.constituencyName = constituencyName;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setYearsInService(int yearsInService) {
//        this.yearsInService = yearsInService;
//    }
//
//    public int getPoliticianId() {
//        return politicianId;
//    }
//
//    public String getPoliticianName() {
//        return politicianName;
//    }
//
//    public String getDesignation() {
//        return designation;
//    }
//
//    public String getConstituencyName() {
//        return constituencyName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public int getYearsInService() {
//        return yearsInService;
//    }
}

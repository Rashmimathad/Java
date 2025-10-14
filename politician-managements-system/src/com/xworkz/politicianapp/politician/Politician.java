package com.xworkz.politicianapp.politician;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Politician {
    private int politicianId;
    private String politicianName;
    private int age;
    private String designation;
    private String constituencyName;
    private String politicalParty;

    @Override
    public String toString() {
        return "Politician{" +
                "politicianId=" + politicianId +
                ", politicianName='" + politicianName + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", constituencyName='" + constituencyName + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                '}';
    }
}

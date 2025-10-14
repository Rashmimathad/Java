package com.xworkz.policeapp.police;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Police {
    private int policeId;
    private String policeName;
    private String designation;
    private String stationName;
    private int age;
    private int yearsOfService;

    @Override
    public String toString() {
        return "Police{" +
                "policeId=" + policeId +
                ", policeName='" + policeName + '\'' +
                ", designation='" + designation + '\'' +
                ", stationName='" + stationName + '\'' +
                ", age=" + age +
                ", yearsOfService=" + yearsOfService +
                '}';
    }
}

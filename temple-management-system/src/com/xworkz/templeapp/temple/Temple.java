package com.xworkz.templeapp.temple;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Temple {
    private int templeId;
    private String templeName;
    private String templeLocation;
    private int noOfDevoteesPerDay;
    private String deityName;
    private String styleOfArchitecture;

    @Override
    public String toString() {
        return "Temple{" +
                "templeId=" + templeId +
                ", templeName='" + templeName + '\'' +
                ", templeLocation='" + templeLocation + '\'' +
                ", noOfDevoteesPerDay=" + noOfDevoteesPerDay +
                ", deityName='" + deityName + '\'' +
                ", styleOfArchitecture='" + styleOfArchitecture + '\'' +
                '}';
    }
}

package com.xworkz.countryapp.dto;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class CountryDto {

    private int countryId;
    private String countryName;
    private Long population;
    private String primeMinisterName;
    private int noOfStates;
    private double area;
    private String continent;
    private boolean isDemocratic;
    private String language;

}

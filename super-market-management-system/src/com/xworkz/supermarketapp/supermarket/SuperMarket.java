package com.xworkz.supermarketapp.supermarket;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class SuperMarket {
    private int storeId;
    private String storeName;
    private String storeLocation;
    private int noOfEmployees;
    private String operatingHours;
    private int noOfBillingCounters;

    @Override
    public String toString() {
        return "SuperMarket{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", storeLocation='" + storeLocation + '\'' +
                ", noOfEmployees=" + noOfEmployees +
                ", operatingHours='" + operatingHours + '\'' +
                ", noOfBillingCounters=" + noOfBillingCounters +
                '}';
    }
}

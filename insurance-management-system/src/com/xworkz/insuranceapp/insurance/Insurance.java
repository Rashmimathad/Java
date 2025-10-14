package com.xworkz.insuranceapp.insurance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Insurance {
    private int policyId;
    private String policyHolderName;
    private String policyType;
    private String policyStartDate;
    private String policyEndDate;
    private String policyStatus;

    @Override
    public String toString() {
        return "Insurance{" +
                "policyId=" + policyId +
                ", policyHolderName='" + policyHolderName + '\'' +
                ", policyType='" + policyType + '\'' +
                ", policyStartDate='" + policyStartDate + '\'' +
                ", policyEndDate='" + policyEndDate + '\'' +
                ", policyStatus='" + policyStatus + '\'' +
                '}';
    }
}

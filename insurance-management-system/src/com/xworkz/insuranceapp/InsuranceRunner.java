package com.xworkz.insuranceapp;

import com.xworkz.insuranceapp.insurance.Insurance;

import java.util.ArrayList;
import java.util.List;

public class InsuranceRunner {

    public static void main(String[] args) {

        List<Insurance> insurances = new ArrayList<>();

        Insurance policyOne = new Insurance(1, "John Doe", "Home Insurance", "2025-01-15", "2026-01-15", "ACTIVE");
        Insurance policyTwo = new Insurance(2, "Jane Smith", "Car Insurance", "2025-03-10", "2026-03-10", "ACTIVE");
        Insurance policyThree = new Insurance(3, "Alice Johnson", "Health Insurance", "2025-04-05", "2026-04-05", "ACTIVE");
        Insurance policyFour = new Insurance(4, "Bob Brown", "Life Insurance", "2025-05-25", "2026-05-25", "ACTIVE");
        Insurance policyFive = new Insurance(5, "Charlie Davis", "Home Insurance", "2025-06-30", "2026-06-30", "ACTIVE");
        Insurance policySix = new Insurance(6, "Diana Evans", "Car Insurance", "2025-07-10", "2026-07-10", "ACTIVE");
        Insurance policySeven = new Insurance(7, "Eve Harris", "Health Insurance", "2025-08-20", "2026-08-20", "ACTIVE");
        Insurance policyEight = new Insurance(8, "Frank Clark", "Life Insurance", "2025-09-25", "2026-09-25", "ACTIVE");
        Insurance policyNine = new Insurance(9, "Grace Lewis", "Home Insurance", "2025-10-05", "2026-10-05", "ACTIVE");
        Insurance policyTen = new Insurance(10, "Henry Walker", "Car Insurance", "2025-11-15", "2026-11-15", "ACTIVE");
        Insurance policyEleven = new Insurance(11, "Ivy Hall", "Health Insurance", "2025-12-25", "2026-12-25", "ACTIVE");
        Insurance policyTwelve = new Insurance(12, "Jack Allen", "Life Insurance", "2026-01-05", "2027-01-05", "ACTIVE");
        Insurance policyThirteen = new Insurance(13, "Kathy Young", "Home Insurance", "2026-02-15", "2027-02-15", "ACTIVE");
        Insurance policyFourteen = new Insurance(14, "Leo Hernandez", "Car Insurance", "2026-03-20", "2027-03-20", "ACTIVE");
        Insurance policyFifteen = new Insurance(15, "Mona King", "Health Insurance", "2026-04-30", "2027-04-30", "ACTIVE");
        Insurance policySixteen = new Insurance(16, "Nina Wright", "Life Insurance", "2026-05-10", "2027-05-10", "ACTIVE");
        Insurance policySeventeen = new Insurance(17, "Oscar Scott", "Home Insurance", "2026-06-25", "2027-06-25", "ACTIVE");
        Insurance policyEighteen = new Insurance(18, "Paul Green", "Car Insurance", "2026-07-15", "2027-07-15", "ACTIVE");
        Insurance policyNineteen = new Insurance(19, "Quincy Adams", "Health Insurance", "2026-08-05", "2027-08-05", "ACTIVE");
        Insurance policyTwenty = new Insurance(20, "Rachel Baker", "Life Insurance", "2026-09-25", "2027-09-25", "ACTIVE");

        insurances.add(policyOne);
        insurances.add(policyTwo);
        insurances.add(policyThree);
        insurances.add(policyFour);
        insurances.add(policyFive);
        insurances.add(policySix);
        insurances.add(policySeven);
        insurances.add(policyEight);
        insurances.add(policyNine);
        insurances.add(policyTen);
        insurances.add(policyEleven);
        insurances.add(policyTwelve);
        insurances.add(policyThirteen);
        insurances.add(policyFourteen);
        insurances.add(policyFifteen);
        insurances.add(policySixteen);
        insurances.add(policySeventeen);
        insurances.add(policyEighteen);
        insurances.add(policyNineteen);
        insurances.add(policyTwenty);

        System.out.println("Total insurance policies:");
        for (Insurance insurance : insurances) {
            System.out.println(insurance);
        }
        System.out.println();

        List<Insurance> additionalPolicies = new ArrayList<>();
        Insurance policyTwentyOne = new Insurance(21, "Steve Moore", "Home Insurance", "2026-10-10", "2027-10-10", "ACTIVE");
        Insurance policyTwentyTwo = new Insurance(22, "Tracy Taylor", "Car Insurance", "2026-11-20", "2027-11-20", "ACTIVE");
        Insurance policyTwentyThree = new Insurance(23, "Uma Harris", "Health Insurance", "2026-12-05", "2027-12-05", "ACTIVE");
        Insurance policyTwentyFour = new Insurance(24, "Victor Martinez", "Life Insurance", "2027-01-15", "2028-01-15", "ACTIVE");
        Insurance policyTwentyFive = new Insurance(25, "Wendy Robinson", "Home Insurance", "2027-02-25", "2028-02-25", "ACTIVE");

        additionalPolicies.add(policyTwentyOne);
        additionalPolicies.add(policyTwentyTwo);
        additionalPolicies.add(policyTwentyThree);
        additionalPolicies.add(policyTwentyFour);
        additionalPolicies.add(policyTwentyFive);

        System.out.println("Total additional insurance policies:");
        for (Insurance insurance : additionalPolicies) {
            System.out.println(insurance);
        }
        System.out.println();

        System.out.println("Is additionalPolicies added to insurances: " + insurances.addAll(additionalPolicies));
        System.out.println("Is insurances contains policySeven: " + insurances.contains(policySeven));
        System.out.println("Is insurances contains all additionalPolicies: " + insurances.containsAll(additionalPolicies));
        System.out.println();

        System.out.println("Total insurance policies:");
        for (Insurance insurance : insurances) {
            System.out.println(insurance);
        }

        System.out.println();
        System.out.println("Is policyTwentyOne removed: " + insurances.remove(policyTwentyOne));
        System.out.println("Is additionalPolicies removed from insurances: " + insurances.removeAll(additionalPolicies));
        System.out.println();
        System.out.println("Total insurance policies:");
        for (Insurance insurance : insurances) {
            System.out.println(insurance);
        }
    }
}

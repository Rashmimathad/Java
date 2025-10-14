package com.xworkz.loanapp;

import com.xworkz.loanapp.loan.Loan;
import com.xworkz.loanapp.constants.LoanStatus;

import java.util.ArrayList;
import java.util.List;

public class LoanRunner {

    public static void main(String[] args) {

        List<Loan> loans = new ArrayList<>();

        Loan loanOne = new Loan(1, "Home Loan", "John Doe", LoanStatus.APPROVED, "2025-01-15", "2025-02-20");
        Loan loanTwo = new Loan(2, "Car Loan", "Jane Smith", LoanStatus.SANCTIONED, "2025-03-10", "2025-04-05");
        Loan loanThree = new Loan(3, "Personal Loan", "Alice Johnson", LoanStatus.IN_PROGRESS, "2025-04-05", "2025-05-10");
        Loan loanFour = new Loan(4, "Education Loan", "Bob Brown", LoanStatus.ON_HOLD, "2025-05-25", "2025-06-10");
        Loan loanFive = new Loan(5, "Home Loan", "Charlie Davis", LoanStatus.CANCELLED, "2025-06-30", "2025-07-15");
        Loan loanSix = new Loan(6, "Car Loan", "Diana Evans", LoanStatus.APPROVED, "2025-07-10", "2025-08-15");
        Loan loanSeven = new Loan(7, "Personal Loan", "Eve Harris", LoanStatus.SANCTIONED, "2025-08-20", "2025-09-05");
        Loan loanEight = new Loan(8, "Education Loan", "Frank Clark", LoanStatus.IN_PROGRESS, "2025-09-25", "2025-10-10");
        Loan loanNine = new Loan(9, "Home Loan", "Grace Lewis", LoanStatus.ON_HOLD, "2025-10-05", "2025-10-20");
        Loan loanTen = new Loan(10, "Car Loan", "Henry Walker", LoanStatus.CANCELLED, "2025-11-15", "2025-11-30");
        Loan loanEleven = new Loan(11, "Personal Loan", "Ivy Hall", LoanStatus.APPROVED, "2025-12-25", "2026-01-10");
        Loan loanTwelve = new Loan(12, "Education Loan", "Jack Allen", LoanStatus.SANCTIONED, "2026-01-05", "2026-01-20");
        Loan loanThirteen = new Loan(13, "Home Loan", "Kathy Young", LoanStatus.IN_PROGRESS, "2026-02-15", "2026-03-01");
        Loan loanFourteen = new Loan(14, "Car Loan", "Leo Hernandez", LoanStatus.ON_HOLD, "2026-03-20", "2026-04-05");
        Loan loanFifteen = new Loan(15, "Personal Loan", "Mona King", LoanStatus.CANCELLED, "2026-04-30", "2026-05-15");
        Loan loanSixteen = new Loan(16, "Education Loan", "Nina Wright", LoanStatus.APPROVED, "2026-05-10", "2026-06-15");
        Loan loanSeventeen = new Loan(17, "Home Loan", "Oscar Scott", LoanStatus.SANCTIONED, "2026-06-25", "2026-07-10");
        Loan loanEighteen = new Loan(18, "Car Loan", "Paul Green", LoanStatus.IN_PROGRESS, "2026-07-15", "2026-07-30");
        Loan loanNineteen = new Loan(19, "Personal Loan", "Quincy Adams", LoanStatus.ON_HOLD, "2026-08-05", "2026-08-20");
        Loan loanTwenty = new Loan(20, "Education Loan", "Rachel Baker", LoanStatus.CANCELLED, "2026-09-25", "2026-10-10");

        loans.add(loanOne);
        loans.add(loanTwo);
        loans.add(loanThree);
        loans.add(loanFour);
        loans.add(loanFive);
        loans.add(loanSix);
        loans.add(loanSeven);
        loans.add(loanEight);
        loans.add(loanNine);
        loans.add(loanTen);
        loans.add(loanEleven);
        loans.add(loanTwelve);
        loans.add(loanThirteen);
        loans.add(loanFourteen);
        loans.add(loanFifteen);
        loans.add(loanSixteen);
        loans.add(loanSeventeen);
        loans.add(loanEighteen);
        loans.add(loanNineteen);
        loans.add(loanTwenty);

        System.out.println("Total loans:");
        for (Loan loan : loans) {
            System.out.println(loan);
        }
        System.out.println();

        List<Loan> additionalLoans = new ArrayList<>();
        Loan loanTwentyOne = new Loan(21, "Home Loan", "Steve Moore", LoanStatus.APPROVED, "2026-10-10", "2026-11-15");
        Loan loanTwentyTwo = new Loan(22, "Car Loan", "Tracy Taylor", LoanStatus.SANCTIONED, "2026-11-20", "2026-12-05");
        Loan loanTwentyThree = new Loan(23, "Personal Loan", "Uma Harris", LoanStatus.IN_PROGRESS, "2026-12-05", "2026-12-20");
        Loan loanTwentyFour = new Loan(24, "Education Loan", "Victor Martinez", LoanStatus.ON_HOLD, "2027-01-15", "2027-01-30");
        Loan loanTwentyFive = new Loan(25, "Home Loan", "Wendy Robinson", LoanStatus.CANCELLED, "2027-02-25", "2027-03-10");

        additionalLoans.add(loanTwentyOne);
        additionalLoans.add(loanTwentyTwo);
        additionalLoans.add(loanTwentyThree);
        additionalLoans.add(loanTwentyFour);
        additionalLoans.add(loanTwentyFive);

        System.out.println("Total additional loans:");
        for (Loan loan : additionalLoans) {
            System.out.println(loan);
        }
        System.out.println();

        System.out.println("Is additionalLoans added to loans: " + loans.addAll(additionalLoans));
        System.out.println("Is loans contains loanSeven: " + loans.contains(loanSeven));
        System.out.println("Is loans contains all additionalLoans: " + loans.containsAll(additionalLoans));
        System.out.println();

        System.out.println("Total loans:");
        for (Loan loan : loans) {
            System.out.println(loan);
        }

        System.out.println();
        System.out.println("Is loanTwentyOne removed: " + loans.remove(loanTwentyOne));
        System.out.println("Is additionalLoans removed from loans: " + loans.removeAll(additionalLoans));
        System.out.println();
        System.out.println("Total loans:");
        for (Loan loan : loans) {
            System.out.println(loan);
        }
    }
}

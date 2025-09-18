package com.xworkz.loanapp;

import com.xworkz.loanapp.impl.EducationLoanImpl;
import com.xworkz.loanapp.loan.Loan;

public class LoanRunner {
    public static void main(String[] args) {
        Loan loan=new EducationLoanImpl();
        loan.apply();
        loan.approve();
        loan.repay();
    }
}

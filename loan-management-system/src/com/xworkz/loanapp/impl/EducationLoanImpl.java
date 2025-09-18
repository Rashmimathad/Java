package com.xworkz.loanapp.impl;

import com.xworkz.loanapp.LoanRunner;
import com.xworkz.loanapp.loan.Loan;

public class EducationLoanImpl implements Loan {
    @Override
    public void apply() {
        System.out.println("Education loan applied");
    }

    @Override
    public void approve() {
        System.out.println("Education loan approved");
    }

    @Override
    public void repay() {
        System.out.println("Education loan repayed");
    }
}

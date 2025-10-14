package com.xworkz.loanapp.loan;

import com.xworkz.loanapp.constants.LoanStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Loan {
    private int loanId;
    private String loanName;
    private String customerName;
    private LoanStatus loanStatus;
    private String appliedDate;
    private String approvedDate;

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", loanName='" + loanName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", loanStatus=" + loanStatus +
                ", appliedDate='" + appliedDate + '\'' +
                ", approvedDate='" + approvedDate + '\'' +
                '}';
    }
}

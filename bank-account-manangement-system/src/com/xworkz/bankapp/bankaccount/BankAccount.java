package com.xworkz.bankapp.bankaccount;

import com.xworkz.bankapp.constants.AccountType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class BankAccount {
    private int accountId;
    private int accountNumber;
    private String accountHolderName;
    private String accountHolderLocation;
    private String dateOfBirth;
    private AccountType accountType;

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountHolderLocation='" + accountHolderLocation + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", accountType=" + accountType +
                '}';
    }
}

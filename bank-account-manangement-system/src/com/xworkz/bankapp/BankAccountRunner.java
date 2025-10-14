package com.xworkz.bankapp;

import com.xworkz.bankapp.bankaccount.BankAccount;
import com.xworkz.bankapp.constants.AccountType;

import java.util.ArrayList;
import java.util.List;

public class BankAccountRunner {

    public static void main(String[] args) {

        List<BankAccount> bankAccounts = new ArrayList<>();

        BankAccount accountOne = new BankAccount(1, 1001, "John Doe", "New York", "1990-01-01", AccountType.SAVINGS);
        BankAccount accountTwo = new BankAccount(2, 1002, "Jane Smith", "Los Angeles", "1985-02-15", AccountType.CURRENT);
        BankAccount accountThree = new BankAccount(3, 1003, "Alice Johnson", "Chicago", "1992-03-20", AccountType.SAVINGS);
        BankAccount accountFour = new BankAccount(4, 1004, "Bob Brown", "Houston", "1988-04-25", AccountType.CURRENT);
        BankAccount accountFive = new BankAccount(5, 1005, "Charlie Davis", "Phoenix", "1995-05-30", AccountType.SAVINGS);
        BankAccount accountSix = new BankAccount(6, 1006, "Diana Evans", "Philadelphia", "1980-06-10", AccountType.CURRENT);
        BankAccount accountSeven = new BankAccount(7, 1007, "Eve Harris", "San Antonio", "1993-07-05", AccountType.SAVINGS);
        BankAccount accountEight = new BankAccount(8, 1008, "Frank Clark", "San Diego", "1982-08-15", AccountType.CURRENT);
        BankAccount accountNine = new BankAccount(9, 1009, "Grace Lewis", "Dallas", "1987-09-25", AccountType.SAVINGS);
        BankAccount accountTen = new BankAccount(10, 1010, "Henry Walker", "San Jose", "1990-10-30", AccountType.CURRENT);
        BankAccount accountEleven = new BankAccount(11, 1011, "Ivy Hall", "Austin", "1996-11-05", AccountType.SAVINGS);
        BankAccount accountTwelve = new BankAccount(12, 1012, "Jack Allen", "Jacksonville", "1983-12-20", AccountType.CURRENT);
        BankAccount accountThirteen = new BankAccount(13, 1013, "Kathy Young", "Fort Worth", "1991-01-10", AccountType.SAVINGS);
        BankAccount accountFourteen = new BankAccount(14, 1014, "Leo Hernandez", "Columbus", "1986-02-14", AccountType.CURRENT);
        BankAccount accountFifteen = new BankAccount(15, 1015, "Mona King", "Charlotte", "1994-03-25", AccountType.SAVINGS);
        BankAccount accountSixteen = new BankAccount(16, 1016, "Nina Wright", "San Francisco", "1981-04-30", AccountType.CURRENT);
        BankAccount accountSeventeen = new BankAccount(17, 1017, "Oscar Scott", "Indianapolis", "1992-05-15", AccountType.SAVINGS);
        BankAccount accountEighteen = new BankAccount(18, 1018, "Paul Green", "Seattle", "1984-06-05", AccountType.CURRENT);
        BankAccount accountNineteen = new BankAccount(19, 1019, "Quincy Adams", "Denver", "1990-07-25", AccountType.SAVINGS);
        BankAccount accountTwenty = new BankAccount(20, 1020, "Rachel Baker", "Washington, D.C.", "1989-08-10", AccountType.CURRENT);

        bankAccounts.add(accountOne);
        bankAccounts.add(accountTwo);
        bankAccounts.add(accountThree);
        bankAccounts.add(accountFour);
        bankAccounts.add(accountFive);
        bankAccounts.add(accountSix);
        bankAccounts.add(accountSeven);
        bankAccounts.add(accountEight);
        bankAccounts.add(accountNine);
        bankAccounts.add(accountTen);
        bankAccounts.add(accountEleven);
        bankAccounts.add(accountTwelve);
        bankAccounts.add(accountThirteen);
        bankAccounts.add(accountFourteen);
        bankAccounts.add(accountFifteen);
        bankAccounts.add(accountSixteen);
        bankAccounts.add(accountSeventeen);
        bankAccounts.add(accountEighteen);
        bankAccounts.add(accountNineteen);
        bankAccounts.add(accountTwenty);

        System.out.println("Total bank accounts:");
        for (BankAccount account : bankAccounts) {
            System.out.println(account);
        }
        System.out.println();

        List<BankAccount> bankAccounts1 = new ArrayList<>();
        BankAccount accountTwentyOne = new BankAccount(21, 1021, "Steve Moore", "Boston", "1980-09-15", AccountType.SAVINGS);
        BankAccount accountTwentyTwo = new BankAccount(22, 1022, "Tracy Taylor", "El Paso", "1992-10-20", AccountType.CURRENT);
        BankAccount accountTwentyThree = new BankAccount(23, 1023, "Uma Harris", "Detroit", "1985-11-25", AccountType.SAVINGS);
        BankAccount accountTwentyFour = new BankAccount(24, 1024, "Victor Martinez", "Nashville", "1993-12-30", AccountType.CURRENT);
        BankAccount accountTwentyFive = new BankAccount(25, 1025, "Wendy Robinson", "Portland", "1988-01-05", AccountType.SAVINGS);

        bankAccounts1.add(accountTwentyOne);
        bankAccounts1.add(accountTwentyTwo);
        bankAccounts1.add(accountTwentyThree);
        bankAccounts1.add(accountTwentyFour);
        bankAccounts1.add(accountTwentyFive);

        System.out.println("Total bank accounts of bankAccounts1:");
        for (BankAccount account : bankAccounts1) {
            System.out.println(account);
        }
        System.out.println();

        System.out.println("Is bankAccounts1 added to bankAccounts: " + bankAccounts.addAll(bankAccounts1));
        System.out.println("Is bankAccounts contains accountSeven: " + bankAccounts.contains(accountSeven));
        System.out.println("Is bankAccounts contains all bankAccounts1: " + bankAccounts.containsAll(bankAccounts1));
        System.out.println();

        System.out.println("Total bank accounts:");
        for (BankAccount account : bankAccounts) {
            System.out.println(account);
        }

        System.out.println();
        System.out.println("Is accountTwentyOne removed: " + bankAccounts.remove(accountTwentyOne));
        System.out.println("Is bankAccounts1 removed from bankAccounts: " + bankAccounts.removeAll(bankAccounts1));
        System.out.println();
        System.out.println("Total bank accounts:");
        for (BankAccount account : bankAccounts) {
            System.out.println(account);
        }
    }
}

package com.main.javaprogram;

public class SavingsAccount {
    private int balance;
    private String accountName = "you need a name";

    public SavingsAccount(int balance) {
        this.balance = balance;
    }

    public SavingsAccount(int balance, String accountName) {
        this.balance = balance;
        this.accountName = accountName;
    }

    public int withdrawal(int amountToWithdrawal) {
        balance -= amountToWithdrawal;
        System.out.println(accountName +" balance is " +balance);
        return balance;
    }
}

package org.learning.javaoop1.javabank;

import java.util.Random;

public class BankAccount {
    private int accNumber;
    private String accHolder;

    private double accBalance;

    public BankAccount(String accHolder) {
        this.accNumber = this.genAccNum();
        this.accHolder = accHolder;
        this.accBalance = 0.00;
    }

    //test constructor
//    public BankAccount(String accHolder, int accBalance) {
//        this.accNumber = this.genAccNum();
//        this.accHolder = accHolder;
//        this.accBalance = accBalance;
//    }

    public void deposit(int amount) {
        this.accBalance += amount;
    }

    public void withdraw(int amount) {
        this.accBalance -= amount;
    }

    public int getAccNumber() {
        return this.accNumber;
    }

    public String getAccHolder() {
        return this.accHolder;
    }

    public double getAccBalance() {
        return this.accBalance;
    }

    private int genAccNum() {
        Random ranGen = new Random();
        return ranGen.nextInt(1000) + 1;
    }
}

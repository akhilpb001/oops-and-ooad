package com.udemy.learning.oops.encapsulation;

class Account {
    private double balance = 0;

    public double getBalance() {
        // validation
        return balance;
    }

    public void setBalance(double balance) {
        // validation
        this.balance = balance;
        // more implementation
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Account acct = new Account();
        acct.setBalance(100000);
        System.out.println(acct.getBalance());
    }
}

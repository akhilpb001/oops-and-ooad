package com.udemy.learning.oops.datahiding;


public class AccessAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        System.out.println(acc.getBankBalance("adminuser", "password"));
    }
}

package com.udemy.learning.oops.datahiding;


public class BankAccount {
    private double balance = 100000;
    private String username = "adminuser";
    private String password = "password123";

    public double getBankBalance(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return balance;
        } else {
            return 0;
        }
    }
}

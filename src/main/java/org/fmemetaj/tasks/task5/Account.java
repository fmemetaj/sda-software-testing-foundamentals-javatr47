package org.fmemetaj.tasks.task5;

public class Account {
    private String accountNumber;
    private double balance;
    private String name;

    public Account(String accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void transfer(double amount, Account destination) {
        if (amount > balance) {
            return;
        }
        this.balance -= amount;
        destination.setBalance(destination.getBalance() + amount);
    }
}

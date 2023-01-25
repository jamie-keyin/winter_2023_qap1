package com.keyin.account;

public class Account {
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double initialBalance) {
        this.id = id;
        this.name = name;
        this.balance = initialBalance;
    }

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double transfer(Account accountToCredit, double amount) {
        return accountToCredit.credit(this.debit(amount));
    }

    public double debit(double amount) {
        if (this.getBalance() > amount) {
            this.setBalance(this.getBalance() - amount);

            return amount;
        }

        return 0;
    }

    private void setBalance(double amount) {
        this.balance = amount;
    }

    public double credit(double amount) {
        this.setBalance(this.getBalance() + amount);

        return this.getBalance();
    }
}

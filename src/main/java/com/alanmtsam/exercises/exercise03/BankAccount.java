package com.alanmtsam.exercises.exercise03;

public class BankAccount {

    private String client;
    private String number;
    private double balance = 0.0;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
        this.number = "ABC" + client;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String numberAccount) {
        this.number = numberAccount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double value) {
        if (value > 0) {
            this.balance += value;
        } else {
            System.out.println("Valor não aceito");
        }
    }

    public void withdraw(double value) {
        if (value > 0 && value <= this.balance) {
            this.balance -= value;
        } else {
            System.out.println("Valor incorreto ou saldo insuficiente");
        }
    }

}

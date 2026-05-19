package com.alanmtsam.exercises.exercise03;

public class Main {
    public static void main(String[] args) {
        BankAccount client = new BankAccount();

        client.setClient("Alan");
        client.deposit(100);

        client.withdraw(220);

        System.out.println("Saldo da conta " + client.getNumber() + ": " + client.getBalance());
    }
}

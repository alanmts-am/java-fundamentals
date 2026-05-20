package com.alanmtsam.exercises.exercise05;

public class Product implements ITaxable {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addStock(int quantity) {
        this.quantity += quantity;
    }

    @Override
    public String toString() {
        return "O produto " + this.name + " valendo R$" + this.price + " contêm " + this.quantity + " em estoque";
    }

    @Override
    public double calcTax() {
        return this.price * 1.10;
    }

}

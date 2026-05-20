package com.alanmtsam.exercises.exercise05;

public class ProductImported extends Product {

    private double customsFree;

    public ProductImported(String name, double price, int quantity) {
        super(name, price, quantity);
        this.customsFree = 50;
    }

    @Override
    public double calcTax() {
        return super.getPrice() * 1.10 + this.customsFree;
    }

}

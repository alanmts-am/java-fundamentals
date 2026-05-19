package com.alanmtsam.exercises.exercise04;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Playstation", 4000, 5);
        Product product2 = new Product("Xbox", 3500);

        System.out.println(product1.toString());

        System.out.println(product2.toString());
    }
}

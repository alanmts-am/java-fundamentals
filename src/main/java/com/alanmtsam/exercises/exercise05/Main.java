package com.alanmtsam.exercises.exercise05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Playstation", 4200, 10));
        products.add(new ProductImported("Nintendo Switch 2", 3700, 5));

        for (Product product : products) {
            System.out.println(product.toString());
            System.out.printf("Com as taxas, ele fica por R$" + String.format("%.2f%n", product.calcTax()));
        }
    }
}

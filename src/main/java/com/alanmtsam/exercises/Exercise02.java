package com.alanmtsam.exercises;

import java.util.ArrayList;

public class Exercise02 {
    public static void main(String[] args) {

        ArrayList<String> products = new ArrayList<>();

        products.add("Leite");
        products.add("Pão");
        products.add("Biscoito");
        products.add("Ovo");

        for (String product : products) {
            System.out.println("Item: " + product);
        }

        products.remove(0);

        for (int i = 0; i < products.size(); i++) {
            System.out.println("Item: " + products.get(i));
        }

    }
}

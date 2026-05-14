package com.alanmtsam.exercises;

public class Exercise01 {
    public static void main(String[] args) {
        String productName = "Maça";
        double unitPrice = 2.7;
        int stockQuantity = 30;

        double totalStockValue = unitPrice * stockQuantity;

        boolean needsRestock = stockQuantity < 5;

        System.out.println("O produto " + productName + " está por apenas R$ " + unitPrice);
        System.out
                .println("Hoje em estoque temos, " + (int) totalStockValue + " Maça(s)");

        if (needsRestock) {
            System.out.println("O produto" + productName + " precisa ser reposto");
        } else {
            System.out.println("O produto " + productName + " está com estoque ok");
        }

    }

}

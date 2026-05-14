package com.alanmtsam.Exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        String nomeDoProduto = "Maça";
        double precoUnitario = 2.7;
        int quantidadeEstoque = 30;

        double valorTotalEstoque = precoUnitario * quantidadeEstoque;

        boolean precisaRepor = quantidadeEstoque < 5;

        System.out.println("O produto " + nomeDoProduto + " está por apenas R$ " + precoUnitario);
        System.out
                .println("Hoje em estoque temos, " + (int) valorTotalEstoque + " Maça(s)");

        if (precisaRepor) {
            System.out.println("O produto" + nomeDoProduto + " precisa ser reposto");
        } else {
            System.out.println("O produto " + nomeDoProduto + " está com estoque ok");
        }

    }

}

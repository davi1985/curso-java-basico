package com.davi.cursojava.aula17.labs;


public class Ex23 {

    public static void main(String[] args) {

        double value = 1.99;
        double sum = value;
        int qtd = 50;

        System.out.println("Loja Quase Dois - Tabela de Preços");
        for (int i = 0; i < qtd; i++) {
            System.out.println((i + 1) + " - R$ " + (sum++));
        }
    }

}

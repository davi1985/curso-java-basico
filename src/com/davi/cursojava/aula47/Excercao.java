package com.davi.cursojava.aula47;

public class Excercao {

    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];
            System.out.println("Antes da Exception");
            vetor[4] = 1;
            System.out.println("Texto não impresso!!");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exceção ao tentar acessar index inexistente em vetor");
        }
        System.out.println("Continuação do programa!!");


    }

}

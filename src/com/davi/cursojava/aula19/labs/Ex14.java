package com.davi.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        /**
         * Criar um vetor A com 10 elementos inteiros. Implementar um programa
         * que defina e escreva a média aritmética simples dos elementos
         * ímpares armazenados neste vetor.
         */

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int count = 0;
        int soma = 0;
        double media;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do indice " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                count++;
                soma += vetorA[i];
            }
        }

        media = soma / count;

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Média aritmética do elementos ímpares: " + media);

    }

}

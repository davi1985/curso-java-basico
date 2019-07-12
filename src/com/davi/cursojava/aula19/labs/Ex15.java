package com.davi.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        /**
         * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
         * que defina o percentual de elementos pares e ímpares,
         * respectivamente, armazenados neste vetor.
         */
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int impares = 0;
        int pares = 0;
        double porcentagemPar;
        double porcentagemImpares;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do indice " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                impares++;
            }
        }

        pares = vetorA.length - impares;

        porcentagemPar = (pares * 100) / vetorA.length;
        porcentagemImpares = 100 - porcentagemPar;

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Percentual de índices pares: " + porcentagemPar + "%");
        System.out.println("Percentual de índices pares: " + porcentagemImpares     + "%");

    }

}

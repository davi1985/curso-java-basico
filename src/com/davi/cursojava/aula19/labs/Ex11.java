package com.davi.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/**
		 * Criar um vetor A com 10 elementos inteiros. Implementar um programa
		 * que defina e escreva a quantidade de elementos armazenados neste
		 * vetor que são pares.
		 */
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int count = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do indice " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				count++;
			}
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length ; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		System.out.println("Quantidade de números pares: " + count);

	}

}

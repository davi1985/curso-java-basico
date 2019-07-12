package com.davi.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/**
		 * Criar um vetor A com 10 elementos inteiros. Implementar um programa
		 * que defina e escreva a soma de todos os elementos armazenados
		 * neste vetor.
		 */
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int count = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do indice " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			count += vetorA[i];
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length ; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		System.out.println("Soma dos indices: " + count);

		

	}

}

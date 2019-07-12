package com.davi.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/**
		 * Criar um vetor A com 10 elementos inteiros. Implementar um programa
		 * que determine a soma dos elementos armazenados neste vetor que
		 * são múltiplos de 5.
		 */
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int count = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do indice " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				count += vetorA[i];
			}
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length ; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		System.out.println("Soma dos indices múltiplos de 5: " + count);

	}

}

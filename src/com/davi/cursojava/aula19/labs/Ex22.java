package com.davi.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		/**
		 * Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1,
		 * sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se para implementar
		 * um programa que determine o percentual de números 0's e 1's existentes no
		 * vetor A.
		 */
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int qtdOne = 0;
		int qtdZero = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random() * 1);
			if (vetorA[i] == 1) {
				qtdOne++;
			}else if (vetorA[i] == 0) {
				qtdZero++;
			}
		}
		
		System.out.println();
		System.out.println("Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Percentual de Zeros no array:");
		System.out.println((qtdOne / vetorA.length)* 100);
		System.out.println("Percentual de Uns no array");
		System.out.println((qtdZero / vetorA.length)* 100);
	}

}

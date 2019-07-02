package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/**
		 * Faça um programa que leia 5 números e informe a soma e a média dos números.
		 */
		Scanner scan = new Scanner(System.in);

		int num;
		int soma = 0;
		double media;

		for (int i = 0; i < 5; i++) {

			System.out.println("Entre com um número:");
			num = scan.nextInt();
			
			soma+=num;
		}

		media = soma / 5;
		System.out.println("Soma dos números: " + soma);
		System.out.println("Média dos números: " + media);
	}
}

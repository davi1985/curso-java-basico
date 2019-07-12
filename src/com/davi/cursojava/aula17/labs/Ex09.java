package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/**
		 * Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50
		 */
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i < 50; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
		
		scan.close();
	}

}

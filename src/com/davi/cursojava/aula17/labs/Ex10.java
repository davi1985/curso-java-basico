package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		/**
		 * Faça um programa que receba dois números inteiros e gere os números inteiros
		 * que estão no intervalo compreendido por eles.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro número");
		int num1 = scan.nextInt();
		
		System.out.println("Segundo número");
		int num2 = scan.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		
		scan.close();
	}

}

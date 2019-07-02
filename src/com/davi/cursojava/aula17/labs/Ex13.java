package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Ex13 {

	public static void main(String[] args) {
		/**
		 * Faça um programa que peça dois números, base e expoente, calcule e mostre o
		 * primeiro número elevado ao segundo número. Não utilize a função de potência
		 * da linguagem.
		 */
		Scanner scan = new Scanner(System.in);
		
		int base;
		int potencia;
		
		
		System.out.println("Digite a base");
		base = scan.nextInt();
		
		System.out.println("Digite o segundo número");
		potencia = scan.nextInt();
		
		int result = base;
		
		for (int i = 1; i < potencia; i++) {
			result *= base; 
		}
		
		System.out.println("Resultado: "+ result);
	}

}

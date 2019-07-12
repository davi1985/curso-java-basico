package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double value;
		double sum = 0;
		int qtd = 50;

		System.out.println("Digite o preço do pão:");
		value = scan.nextDouble();

		System.out.println("Preço do Pão: R$ " + value);
		System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
		for (int i = 0; i < qtd; i++) {
			System.out.println((i+1) + " - R$ "+(sum+=value));
		}

		scan.close();
	}

}

package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double popA;
		double taxaA;
		double popB;
		double taxaB;
		int cont = 0;

		boolean valido = false;
		do {
			System.out.println("Entre com a população A:");
			popA = scan.nextDouble();

			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("População precisa ser maior que 0");
			}
		} while (!valido);
		
		valido= false;
		do {
			System.out.println("Entre com a taxa de crescimento da populacão A:");
			taxaA = scan.nextDouble();

			if (taxaA >= 0) {
				valido = true;
			} else {
				System.out.println("Taxa precisa ser maior ou igual a 0");
			}
		} while (!valido);

		valido = false;
		do {
			System.out.println("Entre com a população B:");
			popB = scan.nextDouble();

			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("População precisa ser maior que 0");
			}
		} while (!valido);
		
		valido= false;
		do {
			System.out.println("Entre com a taxa de crescimento da populacão B:");
			taxaB = scan.nextDouble();

			if (taxaB >= 0) {
				valido = true;
			} else {
				System.out.println("Taxa precisa ser maior ou igual a 0");
			}
		} while (!valido);

		while (popA < popB) {
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}
		System.out.println("Populaçao A: " + popA);
		System.out.println("Populaçao B: " + popB);
		System.out.println("Qtd anos: " + cont);
		
		scan.close();
	}

}

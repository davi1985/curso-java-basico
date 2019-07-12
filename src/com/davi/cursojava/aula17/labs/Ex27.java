package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int qtdTemperaturas;
		double temp;
		double sum = 0;
		double menor = Double.MIN_NORMAL;
		double maior = Double.MAX_VALUE;
		
		System.out.println("Entre com a qtd de temperaturas");
		qtdTemperaturas = scan.nextInt();
		
		for (int i = 1; i <= qtdTemperaturas; i++) {
			
			System.out.println("Entre com a temperatura " + i);
			temp = scan.nextDouble();
			
			sum += temp;
			
			if (temp > maior) {
				maior = temp;
			}
			if (temp < menor) {
				menor = temp;
			}
		}
		
		System.out.println("Média: " + (sum/qtdTemperaturas));
		System.out.println("Maior Temperatura: " + maior);
		System.out.println("Menor Temperatura: " + menor);
		
		scan.close();
	}

}

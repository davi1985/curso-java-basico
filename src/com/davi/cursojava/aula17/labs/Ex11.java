package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		int somaFinal = 0;
		
		System.out.println("Primeiro número");
		num1 = scan.nextInt();
		
		System.out.println("Segundo número");
		num2 = scan.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			somaFinal += i;
		}
		System.out.println("Soma final: " + somaFinal);
	}

}

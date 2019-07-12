package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int userNumber;
		int numberStart;
		int numberEnd;
		int result;
		boolean invalid = true;
		
		System.out.println("Digite o número que quer ver a tabuada:");
		userNumber = scan.nextInt();

		do {
			
			System.out.println("Entre com o início da tabuada");
			numberStart = scan.nextInt();

			System.out.println("Entre com o final da tabuada");
			numberEnd = scan.nextInt();

			if (numberEnd > numberStart) {
				invalid = false;
			}

		} while (invalid);
		
		System.out.println("Tabuada de " + userNumber + ":");

		System.out.println("Começar por: " + numberStart);
		System.out.println("Terminar em: " + numberEnd);
		System.out.println();
		
		
		for (int i = numberStart; i <= numberEnd; i++) {
			result = i * userNumber;
			System.out.println(userNumber + " X " + i + " = " + result);
		}
		
		scan.close();

	}

}

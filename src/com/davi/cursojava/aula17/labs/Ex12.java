package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/***
		 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
		 * inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a
		 * tabuada.
		 */
		Scanner scan = new Scanner(System.in);

		int userNumber;
		int result;

		System.out.println("Digite o número que quer ver a tabuada:");
		userNumber = scan.nextInt();

		System.out.println("Tabuada de " + userNumber + ":");

		for (int i = 1; i <= 10; i++) {
			result = i * userNumber;
			System.out.println(userNumber + " X " + i + " = " + result);
		}
		
		scan.close();
	}

}

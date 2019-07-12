package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/***
		 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a
		 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
		 * pedir as informações.
		 */
		Scanner scan = new Scanner(System.in);

		boolean loginValido = false;
		String nameUser;
		String passUser;

		do {
			System.out.println("Digite seu nome:");
			nameUser = scan.next();

			System.out.println("Digite sua senha:");
			passUser = scan.next();

			if (nameUser.equalsIgnoreCase(passUser)) {
				System.out.println("Senha/Usuario não podem ser iguais");
			} else {
				loginValido = true;
				System.out.println("Dados Válidos");
			}
		} while (!loginValido);
		
		
		scan.close();

	}

}

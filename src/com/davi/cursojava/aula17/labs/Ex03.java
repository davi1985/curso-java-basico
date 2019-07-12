package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValido = false;
		String name;
		String sexo;
		String civilStatus;
		int age;
		double salary;
		
		do {
			System.out.println("Digite seu nome");
			name = scan.next();
			if (name.length() >= 3) {
				infoValido = true;
			}else {
				System.out.println("Nome precisa de min. de 3 caracteres");
			}		
		} while (!infoValido);
		
		infoValido = false;
		do {
			System.out.println("Digite a idade");
			age = scan.nextInt();
			if (age > 0 && age <150) {
				infoValido = true;
			}else {
				System.out.println("Idade precisa de min. 0 a 150");
			}		
		} while (!infoValido);
		
		infoValido = false;
		do {
			System.out.println("Digite o salário");
			salary = scan.nextDouble();
			if (salary > 0) {
				infoValido = true;
			}else {
				System.out.println("Idade precisa entre 0 a 150");
			}		
		} while (!infoValido);
		
		infoValido = false;
		do {
			System.out.println("Digite o sexo:");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValido = true;
			}else {
			System.out.println("Digite 'F' para 'feminino' ou 'M' para 'masculino'");
			}		
		} while (!infoValido);
		
		infoValido = false;
		do {
			System.out.println("Digite o Estado Civil:");
			civilStatus = scan.next();
			switch (civilStatus) {
			case "s":
			case "c":
			case "v":
			case "d":
				infoValido = true;
				break;
			default:
				System.out.println("Estado Civil: 's' - solteiro, 'c' - casado, 'v' - viúvo, 'd' - divorciado;");
				break;
			}		
		} while (!infoValido);
		

		System.out.println("===========Dados==========");
		System.out.println("Nome:" + name);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + age);
		System.out.println("Estado Civil: " + civilStatus);
		System.out.println("Salário: " + salary );
		
		
		scan.close();
	}

}

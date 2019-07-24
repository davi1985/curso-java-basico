package com.davi.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[][] compromissos = new String[31][24];
		boolean sair = false;
		int opcao;
		boolean diaValido = false;
		boolean horaValida = false;
		int dia;
		int hora;
		
		while(!sair) {
			System.out.println("Digite 1 para Adicionar Compromisso");
			System.out.println("Digite 2 para Verificar Compromisso");
			System.out.println("Digite 0 para Sair");
			
			opcao = scan.nextInt();
			
			if (opcao == 1) {//adicionar compromisso
				diaValido = false;
				dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mes:");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido, digite novamente");
					}
				}
				
				horaValida = false;
				hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso:");
					hora = scan.nextInt();
					if (dia >= 0 && dia <= 24) {
						horaValida = true;	
					} else {
						System.out.println("Hora invalida, digite novamente");
					}
				}
				dia--;
				System.out.println("Digite o compromisso:");
				compromissos[dia][hora] = scan.next();	
				
			} else if (opcao == 2) {//verificar compromisso
				diaValido = false;
				dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mes:");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido, digite novamente");
					}
				}
				
				horaValida = false;
				hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso:");
					hora = scan.nextInt();
					if (dia >= 0 && dia <= 24) {
						horaValida = true;	
					} else {
						System.out.println("Hora invalida, digite novamente");
					}
				}
				dia--;
				System.out.println("O compromisso agendado é:");
				System.out.println(compromissos[dia][hora]);
				compromissos[dia][hora] = scan.next();
				
			} else if (opcao == 0) {//sair
				System.out.println("Encerrando programa...");
				sair = true;
				
			} else {
				System.out.println("Opção invpalida, digite novamente...");
			}
		}
		
		
		scan.close();
	}

}

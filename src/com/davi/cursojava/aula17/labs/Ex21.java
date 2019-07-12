package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		/**
		 * Faça um programa que calcule o número médio de alunos por turma.
		 * Para isto, peça a quantidade de turmas e a quantidade de alunos para
		 * cada turma. As turmas não podem ter mais de 40 alunos.
		 */
		Scanner scan = new Scanner(System.in);
		int qtdAlunos;
		int qtdClasses;
		int soma = 0;
		double media;
		boolean invalido = true;

		/**[minha-solucao]
		System.out.println("Digite a quantidade de classes");
		qtdClasses = scan.nextInt();

		for (int i = 0; i < qtdClasses; i++) {
			System.out.println("Digite a quantidade de alunos da " + (i+1) + "ª classe");
			qtdAlunos = scan.nextInt();

			if (qtdAlunos > 40) {
				System.out.println("Valor inválido, qtd precisa ser até 40.");
				i--;
			}else {
				soma +=qtdAlunos;
			}
		}

		media = soma / qtdClasses;

		System.out.println("Média de alunos por turma: " + media);
		 */
		//[correcao-professora-loiane]

		System.out.println("Digite a quantidade de classes");
		qtdClasses = scan.nextInt();

		for (int i = 1; i <=qtdClasses ; i++) {

			invalido = true;
			do {
				System.out.println("Entre com o numero de alunos " + i);
				qtdAlunos = scan.nextInt();

				if (qtdAlunos <= 40) {
					invalido = false;
				} else {
					System.out.println("Números de alunos inválido, digite novamente!");
				}

			}while (invalido);

			soma+= qtdAlunos;
		}
		media = soma / qtdClasses;
		System.out.println("Media: " + media);
		
		scan.close();

	}

}

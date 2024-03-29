package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean naoTerminar = true;
		int cod, qtd;
		double total = 0;
		String output = "";

		do {
			System.out.println("Digite o código e a quantidade, digite 0 0 para sair:");
			cod = scan.nextInt();
			qtd = scan.nextInt();

			if (cod == 0 && qtd == 0) {
				naoTerminar = false;
				output += "Total a pagar: "  + total;
			} else {
				if (cod == 100) {
					output += "Cachorro Quente -> 1.2" + qtd;
					output += " = " + (1.2 * qtd) + "\n";
					total += 1.2 * qtd;
				} else if (cod == 101) {
					output += "Bauru Simples -> 1.3" + qtd;
					output += " = " + (1.3 * qtd) + "\n";
					total += 1.3 * qtd;
				} else if (cod == 102) {
					output += "Bauru com Ovo -> 1.5" + qtd;
					output += " = " + (1.5 * qtd) + "\n";
					total += 1.5 * qtd;
				} else if (cod == 103) {
					output += "Hambúrguer -> 1.2" + qtd;
					output += " = " + (1.2 * qtd) + "\n";
					total += 1.2 * qtd;
				} else if (cod == 104) {
					output += "Cheeseburguer -> 1.3" + qtd;
					output += " = " + (1.3 * qtd) + "\n";
					total += 1.3 * qtd;
				} else if (cod == 105) {
					output += "Refrigerante -> 1.0" + qtd;
					output += " = " + (1.0 * qtd) + "\n";
					total += 1 * qtd;
				}
			}

		} while (naoTerminar);
		
		System.out.println(output);
		
		scan.close();

	}

}

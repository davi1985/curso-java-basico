package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		System.out.println("Lojas Tabajaras");

		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		double total;
		String output;
		double valorPago;
		double troco;

		do {
			System.out.println("Deseja informa uma nova compra? S/N");
			continuarCompra = scan.next();

			if (continuarCompra.equalsIgnoreCase("s")) {
				output = "Lojas Tabajara\n";

				System.out.println("Digite a quantida de produtos da compra:");
				qtdProdutos = scan.nextInt();

				total = 0;

				for (int i = 1; i <= qtdProdutos; i++) {
					System.out.println("Informe do produto " + i);
					preco = scan.nextDouble();
					total += preco;

					output += "Produto " + i + ": R$ " + preco + "\n";
				}
				
				output += "Total: R$" + total + "\n";

				System.out.println("Total: R$ " + total);

				System.out.println("Entre com o valor pago");
				valorPago = scan.nextDouble();

				output += "Dinheiro: R$ " + valorPago + "\n";

				troco = total - valorPago;

				output += "Troco: R$ " + troco + "\n";

				System.out.println(output);

			} else {
				sair = true;
			}
			
		} while (!sair);
		
		
		scan.close();
	}

}

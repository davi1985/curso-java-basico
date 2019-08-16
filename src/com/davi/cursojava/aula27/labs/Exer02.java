package com.davi.cursojava.aula27.labs;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.numero = "12345";
		conta.agencia = "38792";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

		boolean saqueEfetuado = conta.realizarSaque(10);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possivel realizar o Saque, saldo insuficiente");
		}

		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentando sacar 500");
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possivel realizar o Saque, saldo insuficiente");
		}

		System.out.println("Depositar 500");
		conta.depositar(500);
		conta.consultarSaldo();

		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando Cheque Especial!");
		} else {
			System.out.println("Saldo Positivo");
		}

		conta.realizarSaque(600);
		conta.consultarSaldo();

		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando Cheque Especial!");
		} else {
			System.out.println("Saldo Positivo");
		}


	}
}

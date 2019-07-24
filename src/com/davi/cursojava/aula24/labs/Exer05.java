package com.davi.cursojava.aula24.labs;


public class Exer05 {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.numero = "12345";
		contaCorrente.agencia = "38792";
		contaCorrente.especial = true;
		contaCorrente.limite = 700;
		contaCorrente.saldo = 100;
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.especial);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.limite);
	}

}

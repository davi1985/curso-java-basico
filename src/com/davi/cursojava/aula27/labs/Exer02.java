package com.davi.cursojava.aula27.labs;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.numero = "12345";
		contaCorrente.agencia = "38792";
		contaCorrente.especial = true;
		contaCorrente.limiteEspecial = 700;
		contaCorrente.valorEspecialUsado = 0;
		contaCorrente.saldo = -10;
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.especial);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.limiteEspecial);
		
		System.out.println("Saldo da conta " + contaCorrente.numero + " = " + contaCorrente.saldo);
	}

}

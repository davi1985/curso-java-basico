package com.davi.cursojava.aula27.labs;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double valorEspecialUsado ;
	double limiteEspecial;
	double saldo;
	
	boolean realizarSaque(double quantiaSaque) {
		//tem saldo na conta
		if (saldo >= quantiaSaque ) {
			saldo -= quantiaSaque;
			return true;
		} else { //não tem saldo na conta
			if (especial) {
				//verificar se o limite tem saldo
				double limite = limiteEspecial - saldo;
				if (limite >= quantiaSaque) {
					saldo -= quantiaSaque;
					return true;
				}
				else {
					return false;
				}
			} else {
				return false;
			}
		}
	}
	
}

package com.davi.cursojava.aula27.labs;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	boolean realizarSaque(double quantiaSaque) {
		//tem saldo na conta
		if (saldo >= quantiaSaque) {
			saldo -= quantiaSaque;
			return true;
		}else {
			//não tem saldo na conta
			if (especial) {
				//verificar se o limite tem saldo
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaSaque) {
					saldo -= quantiaSaque;
					return true;
				} else {
					return false;
				}
			} else {
				// não é especial e nem tem saldo
				return false;
			}
		}
	}
	
	void depositar(double valorDepositar) {
		saldo+= valorDepositar;
	}

	void consultarSaldo() {
		System.out.println("Saldo Atual: " + saldo);
	}

	boolean verificarUsoChequeEspecial() {
		return  saldo < 0;
	}

	
	
	
	
	
	
	
	
	
}

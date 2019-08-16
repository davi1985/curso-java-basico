package com.davi.cursojava.aula35;

public class TesteCalculadora {
	
	static int resultSoma;

	public static void main(String[] args) {

		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);
		
		int fatorialRecursivo = Calculadora.fatorial(5);
		System.out.println(fatorialRecursivo);

	}
	
//	static int soma2Valores(int num1, int num2) {
//		return Calculadora.soma(num1, num2);
//	}

}

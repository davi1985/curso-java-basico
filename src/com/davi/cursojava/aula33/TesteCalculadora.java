package com.davi.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {

		MinhaCalculadora calculadora = new MinhaCalculadora();
		
		int result1 = calculadora.soma(1, 2);
		double result2 = calculadora.soma(1.5, 1.6);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}

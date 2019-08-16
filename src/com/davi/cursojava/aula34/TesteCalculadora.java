package com.davi.cursojava.aula34;

public class TesteCalculadora {
	
	static int resultSoma;

	public static void main(String[] args) {

//		MinhaCalculadora calc = new MinhaCalculadora();
//		System.out.println(calc.soma(1, 2));
		
		resultSoma = MinhaCalculadora.soma(1, 2);
		int result2 = soma2Valores(1, 2);
		
		System.out.println(resultSoma);
		System.out.println(result2);
		
	}
	
	static int soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}

}

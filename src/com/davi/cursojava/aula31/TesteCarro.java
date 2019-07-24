package com.davi.cursojava.aula31;

public class TesteCarro {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.marca = "Fiat";
		carro.numPassageiros = 5;
		carro.modelo = "Uno";
		
		carro.capacidadeCombustivel = 50;
		carro.calcularCombustivel(10);
		carro.exibirAutonomia();
	}

}

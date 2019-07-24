package com.davi.cursojava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;

	Carro() {
		numPassageiros = 4;
		System.out.println("Classe carro foi instanciada");
	}

	Carro(String marca_, String modelo_, int numPassageiros_, double capacidadeCombustivel_, double consumoCombustivel_) {
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capacidadeCombustivel = capacidadeCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}



	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + " km ");
	}
	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado...");
		return capacidadeCombustivel * consumoCombustivel;
	}
	
	
	double calcularCombustivel(double km) {
	
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}
	
}

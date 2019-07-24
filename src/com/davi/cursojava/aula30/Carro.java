package com.davi.cursojava.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;

	
	public Carro(String marca, String modelo, int numPassageiros, double capacidadeCombustivel,
			double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {
	}
	
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Construtor com 3 parâmetros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Contrustor com 2 parâmetros");
	}
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capacidadeCombustivel * this.consumoCombustivel + " km ");
	}
	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado...");
		return this.capacidadeCombustivel * this.consumoCombustivel;
	}
	
	
	double calcularCombustivel(double km) {
	
		double qtdCombustivel = km / this.consumoCombustivel;
		
		return qtdCombustivel;
	}
	
}

package com.davi.cursojava.aula27;

public class TesteCarro { 

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println("----------------");
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
	
		double qtdCombustivel  = van.calcularCombustivel(10);
		
		System.out.println("Para rodar 10km: " + qtdCombustivel);		
	}

}

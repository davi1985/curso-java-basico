package com.davi.cursojava.aula29;

public class TesteCarro2 {

	public static void main(String[] args) {

		Carro2 carro2 = new Carro2("Fiat", "Uno", 5, 90, 0.21);
		Carro2 carro22 = new Carro2("Fiat", "Strada", 2, 80, 0.21);

		System.out.println(carro2.capacidadeCombustivel);
		System.out.println(carro2.consumoCombustivel);

		System.out.println();

		System.out.println(carro22.modelo);
	}

}

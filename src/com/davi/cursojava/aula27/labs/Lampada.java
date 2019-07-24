package com.davi.cursojava.aula27.labs;

public class Lampada {

	String modelo;
	String marca;
	String tensao;
	int potencia;
	String corLuz;
	String tipoLuz;
	int garantia;
	String[] tipos;
	boolean tipoAbajur;
	
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if (ligada) {
			System.out.println("Lâmpada está ligada");
		} else {
			System.out.println("Lâmpada está desligada");
		}
	}
	
	void mudarEstado() {
		if (ligada) {
			desligar();
		}else {
			ligar();
		}
	}
	
}

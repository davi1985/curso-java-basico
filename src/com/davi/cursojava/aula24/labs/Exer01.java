package com.davi.cursojava.aula24.labs;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.corLuz = "amarela";
		lampada.garantia = 12;
		lampada.potencia = 7;
		lampada.tensao = "Bivolt";
		lampada.tipoAbajur = true;
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[2] = "Luminarias";
		
		System.out.println(lampada.tipos[0]);
	}

}

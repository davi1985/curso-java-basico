package com.davi.cursojava.aula24.labs;

public class Exer06 {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.nome = "Davi";
		contato.email = "davisilvaphoto@gmail.com";
		contato.endereco = "Serra de Peroba";
		contato.telefones = new String[3];
		contato.telefones[0] = "88 8888 8888";
		
		contato.telefones[1] = "88 9999 8888";
		contato.telefones[2] = "88 8888 9999";

		System.out.println("Nome do Contato: " + contato.nome);
		System.out.println("Email: " + contato.email);
		System.out.println("Endereço: " + contato.endereco);
		System.out.println("Telefones: ");
		for (int i = 0; i < contato.telefones.length; i++) {
			System.out.println((i + 1) + "° - " + contato.telefones[i]);
		}
		

	}
}

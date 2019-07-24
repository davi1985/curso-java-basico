package com.davi.cursojava.aula24.labs;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {

		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.nome = "Pearl Harbor";
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.nomeEmprestado = "Davi";
		
	}

}

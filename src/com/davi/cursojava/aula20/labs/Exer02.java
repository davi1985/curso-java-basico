package com.davi.cursojava.aula20.labs;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {
		int[][] numerosAleatorios = new int[10][10];
		int maiorL5 = 0;
		int menorL5 = 0;
		int maiorC7 = 0;
		int menorC7 = 0;
		
		// criar numeros aleatorios
		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}

		// row 5
		for (int i = 0; i < numerosAleatorios[5].length; i++) {
			if (numerosAleatorios[5][i] > maiorL5) {
				maiorL5 = numerosAleatorios[5][i];
			}
			if (numerosAleatorios[5][i] < menorL5) {
				menorL5 = numerosAleatorios[5][i];
			}
		}

		System.out.println("Maior valor linha 5: " + maiorL5);
		System.out.println("Menor valor linha 5: " + menorL5);
		//column 7
		for (int i = 0; i < numerosAleatorios.length; i++) {
			if (numerosAleatorios[i][7] > maiorC7) {
				maiorC7 = numerosAleatorios[i][7];
			}
			if (numerosAleatorios[i][7] < menorC7) {
				menorC7 = numerosAleatorios[i][7];
			}
		}
		
		System.out.println("Maior valor coluna 7: " + maiorC7);
		System.out.println("Menor valor coluna 7: " + menorC7);
	}

}

package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o n-esimo termo da série de fibonate");
		int num = scan.nextInt();
		int primeiro = 1;
		int segundo = 1;
		int proximo;

		System.out.println(primeiro);
		System.out.println(segundo);

		for (int i = 3; i <= num; i++){
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.println(proximo);
		}
	}

}

package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		//Scanner scan = new Scanner(System.in);
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;

		while (proximo <= 500) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.println(proximo);
		}
	}

}
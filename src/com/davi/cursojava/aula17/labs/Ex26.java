package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número");
		int num = scan.nextInt();

		System.out.println("Fatorial de " + num);

		System.out.print(num + "! = " );
		
		int fatorial = 1;
		for (int i=num; i > 0; i --){
			fatorial *=i;
			System.out.print(i + " . ");
		}
		System.out.println("1 = " + fatorial);
		
		
		scan.close();
	}

}

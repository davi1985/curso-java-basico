package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		boolean primo;
		
		System.out.println("Entre com um número");
		num = scan.nextInt();
		
		for (int i = 1; i < num; i++) {
			primo = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0 ) {
					primo = false;
				}
			}
			
			if (primo) {
				System.out.print(i + " ");
			}
		}
		
		scan.close();
	}

}

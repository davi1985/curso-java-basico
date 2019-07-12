package com.davi.cursojava.aula18;

import java.util.Scanner;

public class BraekEContinue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//break
		
		/*System.out.println("Entre com um número");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite:");
		int max = scan.nextInt();
		
		for (int i = num; i <= max; i++) {
			
			if (i % 7 == 0) {
				System.out.println("O valor de i é " + i);
				break;
			}
		}*/
		
		//continue
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite:");
		int max = scan.nextInt();
		
		for (int i = num; i <= max; i++) {			
			if (i % 7 == 0) {
				System.out.println("i = " + i);
				continue;
			}
			System.out.println("O valor de i é " + i);
		}
		
		scan.close();
	}

}

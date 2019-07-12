package com.davi.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double salario = 1000;
		double percentual = 1.5;
		salario += (salario / 100) * percentual;

		// Classe para formatacão de números;
		DecimalFormat format = new DecimalFormat("###,###.##");

		for (int i = 1997; i <= 2019; i++) {
			percentual *= 2;
			salario += (salario / 100) * percentual;

			System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
		}
		
		scan.close();
	}

}

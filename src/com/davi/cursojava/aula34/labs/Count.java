package com.davi.cursojava.aula34.labs;

public class Count {

	private static int count;
	
	public Count() {
		count++;
	}
	
	public static void increment() {
		count++;
	}
	
	public static void zerar() {
		count = 0; 
	}
	
	public static int showValue() {
		return count;
	}
}

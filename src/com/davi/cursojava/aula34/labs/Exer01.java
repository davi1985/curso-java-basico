package com.davi.cursojava.aula34.labs;

public class Exer01 {

	static void showValue() {
		System.out.println(Count.showValue());
	}
	
	public static void main(String[] args) {

		showValue();
		
		Count.increment();
		
		showValue();
		
		Count.zerar();
		
		showValue();
		
		Count.increment();
		Count.increment();
		Count.increment();
		
		showValue();
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		showValue();		
		
	}

}

package com.davi.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Student student = new Student();
		
		student.setCourse("Análise e Desenvolvimento de Sistemas");
		double[] notes = {10, 9,8.7};
		student.setNotes(notes);
		 
		System.out.println(student);
		
		String s1 = "afdsafasdf";
		String s2 = "afdsafasdF";
		
		System.out.println(s1.equals(s2));
	}

}

package com.davi.cursojava.aula45;

public class Teste {

	public static void main(String[] args) {
		Student student = new Student();
		Person personStudent = student;
		
		Person student2 = (Person) new Student();
		
		Person student3 = new Person();
		Student student4 = (Student) student3;
	}
	
}

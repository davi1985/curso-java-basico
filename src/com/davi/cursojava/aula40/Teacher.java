package com.davi.cursojava.aula40;

public class Teacher extends Person {

	private double salary;
	private String courseName;
	
		
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public double calcSalaryLiquid() {
		return 0;
	}
	
	public String getAdressTicket() {
		String s = "Teacher adres: ";
		s += this.getAdress();

		return s;
	}
	
	
}

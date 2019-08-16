package com.davi.cursojava.aula39;

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
	
	
}

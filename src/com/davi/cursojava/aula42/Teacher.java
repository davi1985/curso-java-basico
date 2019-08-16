package com.davi.cursojava.aula42;

public class Teacher{

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

		String s = "Teacher adress: ";
		//s += this.getAdress();

		return s;
	}
	
	//@Override
	public void showTicketAddress() {
		
		System.out.println("Teacher:");
		System.out.println(this.getAdressTicket());
		
	}
	
	
}

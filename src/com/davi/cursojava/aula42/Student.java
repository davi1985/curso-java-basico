package com.davi.cursojava.aula42;

public class Student {
	
	private String course;
	private double[] notes;
			
	public Student() {
		super();
	}
		
	public Student(String name, String adress, String phone, String course) {
//		super(name, adress, phone);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public double[] getNotes() {
		return notes;
	}
	public void setNotes(double[] notes) {
		this.notes = notes;
	}
	
	public double mediaNotes() {
		return 0;
	}
	
	public boolean isApproved() {
		return true;
	}
	
	public void anyMethod() {
		//super.setCpf("123456789");
	//	this.setCpf("123456789");
	}

	public String getAdressTicket() {
		String s = "Student adress: ";
		//s += this.getAdress();

		return s;
	}

	//@Override
	public void showTicketAddress() {
		System.out.println(this.getAdressTicket());		
	}
	
}

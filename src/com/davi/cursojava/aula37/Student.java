package com.davi.cursojava.aula37;

public class Student extends Person {
	
	
	private String course;
	private double[] notes;
		
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
	
}

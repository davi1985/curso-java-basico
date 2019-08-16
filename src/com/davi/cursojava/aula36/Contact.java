package com.davi.cursojava.aula36;

public class Contact {

	private String name;
	private Adress adress;
	private Phone[] phones;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	public Phone[] getPhones() {
		return phones;
	}
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}	
	
	
}

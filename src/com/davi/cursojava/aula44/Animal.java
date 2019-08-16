package com.davi.cursojava.aula44;

public abstract class Animal {

	private String name;
	
	public abstract void emitirSom();
	
	public String getname() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

package com.davi.cursojava.aula46;

public interface SqlDCL {

	public void grant(String access);
	public Void revoke(String access);
}

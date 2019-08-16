package com.davi.cursojava.aula33.labs;

public class Lampada {

	private String modelo;
	private String marca;
	private String tensao;
	private int potencia;
	private String corLuz;
	private String tipoLuz;
	private int garantia;
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;
	
	public Lampada() {}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public String getCorLuz() {
		return corLuz;
	}
	
	public void setCorLuz(String corLuz) {
		this.corLuz = corLuz;
	}
	
	public String getTipoLuz() {
		return tipoLuz;
	}
	
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	
	public int getGarantia() {
		return garantia;
	}
	
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	
	public String[] getTipos() {
		return tipos;
	}
	
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	
	public boolean isTipoAbajur() {
		return tipoAbajur;
	}
	
	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}
	
	public boolean isLigada() {
		return ligada;
	}
	
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	
	
	
//	void ligar() {
//		ligada = true;
//	}
//	
//	void desligar() {
//		ligada = false;
//	}
//	
//	void mostrarEstado() {
//		if (ligada) {
//			System.out.println("Lâmpada está ligada");
//		} else {
//			System.out.println("Lâmpada está desligada");
//		}
//	}
//	
//	void mudarEstado() {
//		if (ligada) {
//			desligar();
//		}else {
//			ligar();
//		}
//	}
}

package com.ecodation.karma;

//abstract classlarda sadece public ve default
abstract public class Bilgisayar {
	
	private String anakart;
	private String ram;
	
	// parametresiz constructor
	public Bilgisayar() {
		this.anakart = "Default";
		this.ram     = "2GB";
	}
	/*
	 * static { anakart = "Default"; ram = "2GB"; }
	 */
	
	// Getter and Setter
	public String getAnakart() {
		return anakart;
	}
	public void setAnakart(String anakart) {
		this.anakart = anakart;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	// toString
	@Override
	public String toString() {
		return "Bilgisayar [anakart=" + anakart + ", ram=" + ram + "]";
	}
	
	// gövdesiz methods
	abstract public void hamitMizrak();
	
}

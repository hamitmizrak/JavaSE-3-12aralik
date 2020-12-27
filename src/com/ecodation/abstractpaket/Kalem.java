package com.ecodation.abstractpaket;

abstract public class Kalem {
	
	private String kalemAdi;
	private String fiyati;
	
	// gövdesiz method
	abstract public void methodAdi();
	
	// getter and setter
	public String getKalemAdi() {
		return kalemAdi;
	}
	public void setKalemAdi(String kalemAdi) {
		this.kalemAdi = kalemAdi;
	}
	public String getFiyati() {
		return fiyati;
	}
	public void setFiyati(String fiyati) {
		this.fiyati = fiyati;
	}
	
	// new oluşturamazsın. gövdeli veya gövdesiz method oluşturabiliriz.
	
}

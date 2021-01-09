package com.ecodation.compositions;

//composition
// çok tane
public class Kitap {
	
	private String kitapAdi;
	private String kitapBasimYili;
	private Yazar yazar;
	
	// parametresiz constructor
	public Kitap() {
		yazar = new Yazar();
		
	}
	// parametreli constructor
	public Kitap(String kitapAdi, String kitapBasimYili) {
		// super();
		this.kitapAdi       = kitapAdi;
		this.kitapBasimYili = kitapBasimYili;
	}
	
	// getter and setter
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getKitapBasimYili() {
		return kitapBasimYili;
	}
	public void setKitapBasimYili(String kitapBasimYili) {
		this.kitapBasimYili = kitapBasimYili;
	}
	// composiiton getter and setter
	public Yazar getYazar() {
		return yazar;
	}
	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}
	
}

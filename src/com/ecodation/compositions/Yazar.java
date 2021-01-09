package com.ecodation.compositions;

import java.util.ArrayList;
import java.util.List;

//composition
//  1 tane
public class Yazar {
	
	private String yazarAdi;
	private String yazarSoyadi;
	
	private List<Kitap> kitapListesi;
	
	// parametresiz constructor
	public Yazar() {
		kitapListesi = new ArrayList<Kitap>();
	}
	// parametreli constructor
	public Yazar(String yazarAdi, String yazarSoyadi) {
		// super();
		this.yazarAdi    = yazarAdi;
		this.yazarSoyadi = yazarSoyadi;
	}
	
	// getter and setter
	public String getYazarAdi() {
		return yazarAdi;
	}
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}
	public String getYazarSoyadi() {
		return yazarSoyadi;
	}
	public void setYazarSoyadi(String yazarSoyadi) {
		this.yazarSoyadi = yazarSoyadi;
	}
	
	// composition getter setter
	public List<Kitap> getKitapListesi() {
		return kitapListesi;
	}
	public void setKitapListesi(List<Kitap> kitapListesi) {
		this.kitapListesi = kitapListesi;
	}
	
}

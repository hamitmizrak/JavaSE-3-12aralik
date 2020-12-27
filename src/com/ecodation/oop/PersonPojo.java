package com.ecodation.oop;

//get: Liste getirmek  set: Bir şey yazmak
//pojo: private ve getter ve setter
public class PersonPojo {
	
	// nesne değişkenleri
	private long tcKimlik;
	private String adi;
	private String soyadi;
	
	// Getter and Setter
	public long getTcKimlik() {
		return tcKimlik;
	}
	public void setTcKimlik(long tcKimlik) {
		this.tcKimlik = tcKimlik;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
}

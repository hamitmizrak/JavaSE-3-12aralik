package com.ecodation.oop;

import java.io.Serializable;

//get: Liste getirmek  set: Bir şey yazmak
//bean=constructor + Seriazable+  pojo: private ve getter ve setter
public class PersonBean implements Serializable {
	// finalda sadece get metodu vardır
	private static final long serialVersionUID = -7876969031055502863L;
	// nesne değişkenleri
	private long tcKimlik;
	private String adi;
	private String soyadi;
	
	// parametresiz constructor
	public PersonBean() {
		this.tcKimlik = 1234;
		adi           = "adınızı yazmadınız";
		this.soyadi   = "soyadınızı yazmadınız.";
	}
	
	// parametreli constructor
	// constructor: Class ismiyle aynı olmaz zorunda. return olmaz. kurucu metotdur.
	public PersonBean(long tcKimlik, String adi, String soyadi) {
		this.tcKimlik = tcKimlik;
		this.adi      = adi;
		this.soyadi   = soyadi;
	}
	
	// parametreli constructor.
	// Overloading: herşey aynı ancak parametre sayıları farklı.
	public PersonBean(String adi, String soyadi) {
		this.adi    = adi;
		this.soyadi = soyadi;
	}
	
	public PersonBean(String adi) {
		this.adi = adi;
	}
	
	public PersonBean(String soyadi, long tcKimlik) {
		// this.soyadi = soyadi;
		this("Hamit", "Mızrak");
	}
	
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
	
	// toString
	@Override
	public String toString() {
		return "PersonBean [tcKimlik=" + tcKimlik + ", adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
}

package com.ecodation.genericsx;

public class HamitGenerics<T> {
	// fiel
	private T adi;
	private T soyadi;
	private T yil;
	
	// parametresiz cosnstructor
	public HamitGenerics() {
	}
	
	// parametreli Generics constructor
	public HamitGenerics(T adi, T soyadi, T yil) {
		super();
		this.adi    = adi;
		this.soyadi = soyadi;
		this.yil    = yil;
	}
	
	// getter setter Generics
	public T getAdi() {
		return adi;
	}
	
	public void setAdi(T adi) {
		this.adi = adi;
	}
	
	public T getSoyadi() {
		return soyadi;
	}
	
	public void setSoyadi(T soyadi) {
		this.soyadi = soyadi;
	}
	
	public T getYil() {
		return yil;
	}
	
	public void setYil(T yil) {
		this.yil = yil;
	}
	
}

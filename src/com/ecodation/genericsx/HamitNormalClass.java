package com.ecodation.genericsx;

public class HamitNormalClass {
	
	private String adi;
	private String soyadi;
	
	public HamitNormalClass() {
		
	}
	
	public HamitNormalClass(String adi, String soyadi) {
		super();
		this.adi    = adi;
		this.soyadi = soyadi;
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

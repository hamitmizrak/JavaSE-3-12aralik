package com.ecodation.abstractx;

//eğer  tane bile method abstract ise class abstract olmak zorundadır.
abstract public class AbstractPerson {
	
	private int parmakIzi;
	private String zekasi;
	private String gozRetinasi;
	private long tc;
	private String adi;
	
	// Gövdeli method
	public void denemeMethod() {
		System.out.println("Gövdeli Method");
	}
	
	// Gövdesiz method
	abstract public void denemeMethod2();
	
	// getter setter
	public int getParmakIzi() {
		return parmakIzi;
	}
	public void setParmakIzi(int parmakIzi) {
		this.parmakIzi = parmakIzi;
	}
	public String getZekasi() {
		return zekasi;
	}
	public void setZekasi(String zekasi) {
		this.zekasi = zekasi;
	}
	public String getGozRetinasi() {
		return gozRetinasi;
	}
	public void setGozRetinasi(String gozRetinasi) {
		this.gozRetinasi = gozRetinasi;
	}
	public long getTc() {
		return tc;
	}
	public void setTc(long tc) {
		this.tc = tc;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
}

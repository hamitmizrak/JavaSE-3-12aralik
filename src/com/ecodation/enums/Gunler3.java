package com.ecodation.enums;

public enum Gunler3 {
	pazar(0, "PAZAR"), pazartesi(1, "PAZARTESI"), sali(2, "SALI"), carsamba(3, "CARSAMBA"), persembe(4, "PERSEMBE"),
	cuma(5, "CUMA"), cumartesi(6, "CUMARTESİ");
	
	// değişkenler
	private final int sayi;
	private final String gun;
	
	// parametreli constructor
	private Gunler3(int sayi, String gun) {
		this.sayi = sayi;
		this.gun  = gun;
	}
	
	// getter
	public int getSayi() {
		return sayi;
	}
	
	public String getGun() {
		return gun;
	}
	
}

package com.ecodation.enums;

public enum Gunler2 {
	pazartesi(0), sali(1), carsamba(2), persembe(3), cuma(4), cumartesi(5), pazar(6);
	
	// nesne değişkeni Dikkat: final yazalım
	
	private final int sayi;
	
	// parametreli constructor Dikkat: public olmayacak
	private Gunler2(int sayi) {
		this.sayi = sayi;
	}
	
	// sadece getter
	public int getSayi() {
		return sayi;
	}
	
}

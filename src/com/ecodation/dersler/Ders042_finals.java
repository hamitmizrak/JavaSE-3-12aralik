package com.ecodation.dersler;

public final class Ders042_finals {// bu classı kimse kalıtımla alamaz. extends edemez
	
	public final void metotAdi() { // bu metotu kimse override edemez
	
	}
	
	public static void main(String[] args) {
		
		final String kelime = "deneme";
		// kelime = "yeni kelime";
		System.out.println(kelime);
	}
	
}

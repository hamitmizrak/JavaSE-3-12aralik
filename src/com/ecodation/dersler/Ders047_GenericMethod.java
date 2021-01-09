package com.ecodation.dersler;

public class Ders047_GenericMethod {
	
	// Normal Methods
	public static void denemeMethod(int yil) {
		int tarih = 2021 - yil;
		System.out.println(tarih);
	}
	
	// generics Methods
	public static <T extends Number> void denemeMethod2(T yil) {
		System.out.println(yil);
	}
	
	public static void main(String[] args) {
		denemeMethod(1950);
		denemeMethod2(1690);
		// denemeMethod2("sdf"); sadece sayı yazabilirsin
	}
	
}

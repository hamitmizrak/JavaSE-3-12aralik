package com.ecodation.enums;

public class MainClass {
	
	public static void main(String[] args) {
		Gunler gunler = Gunler.pazar;
		System.out.println(gunler);
		System.out.println(Gunler.values()[0]);
		for (Gunler gunlerFor : Gunler.values()) {
			System.out.println(gunlerFor);
		}
		
		// enums.ordinal());
		// Enums.values()[0]
		
		Gunler2 gunler2 = Gunler2.sali;
		// System.out.println(gunler2);
		// System.out.println("ordinal:" + gunler2.ordinal());
		System.out.println("---------");
		System.out.println(Gunler2.values()[0]);
	}
}

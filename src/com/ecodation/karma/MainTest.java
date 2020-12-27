package com.ecodation.karma;

public class MainTest {
	
	public static void main(String[] args) {
		// Bilgisayar bilgisayar = new Bilgisayar();
		// System.out.println(bilgisayar);
		
		Msi msi = new Msi();
		msi.setAnakart("Xdf-125");
		msi.setRam("16GB");
		msi.hamitMizrak(); // polymorphism
		msi.giris();// polymorphism
		msi.renk();// polymorphism
		
		System.out.println("msi Anakart özelliği: " + msi.getAnakart());
		System.out.println("msi ram özelliği: " + msi.getRam());
		
		System.out.println();
		
		Lenova lenova = new Lenova();
		lenova.setAnakart("Len78fX");
		lenova.setRam("Len12G");
		lenova.hamitMizrak();// polymorphism
		lenova.giris();// polymorphism
		lenova.renk();// polymorphism
		
		System.out.println("lenova Anakart özelliği: " + lenova.getAnakart());
		System.out.println("lenova ram özelliği: " + lenova.getRam());
		
	}
	
}

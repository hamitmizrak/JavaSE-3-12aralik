package com.ecodation.abstractx;

public class MainClassAbstract {
	
	public static void main(String[] args) {
		// en tepetekininn örneğini oluşturmamak için
		AbstractPerson person = new Beyza();// poly -morphism
		// System.out.println(person);
		
		Beyza beyza = new Beyza();
		beyza.setParmakIzi(415);
		beyza.denemeMethod2(); // poly -morphism Tek yumurta ikizleri
		System.out.println(beyza.getParmakIzi());
		
		System.out.println("----------------------------");
		Ebru ebru = new Ebru();
		ebru.setParmakIzi(556);
		ebru.denemeMethod2();
		System.out.println(ebru.getParmakIzi());
		
		System.out.println("----------------------------");
		Gozde gozde = new Gozde();
		gozde.setParmakIzi(578);
		gozde.denemeMethod2();
		System.out.println(gozde.getParmakIzi());
		System.out.println("----------------------------");
		Sahin sahin = new Sahin();
		sahin.setParmakIzi(963);
		sahin.denemeMethod2();
		System.out.println(sahin.getParmakIzi());
		
		System.out.println("----------------------------");
		Seyma seyma = new Seyma();
		seyma.setParmakIzi(456);
		seyma.denemeMethod2();
		System.out.println(seyma.getParmakIzi());
		
		System.out.println("----------------------------");
		Yigit yigit = new Yigit();
		yigit.setParmakIzi(753);
		yigit.denemeMethod2();
		System.out.println(yigit.getParmakIzi());
	}
}

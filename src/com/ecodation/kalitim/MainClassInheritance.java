package com.ecodation.kalitim;

public class MainClassInheritance {
	
	public static void main(String[] args) {
		InheritancePerson person = new InheritancePerson();
		System.out.println(person);
		
		Beyza beyza = new Beyza();
		beyza.setParmakIzi(415);
		System.out.println(beyza.getParmakIzi());
		
		Ebru ebru = new Ebru();
		ebru.setParmakIzi(556);
		System.out.println(ebru.getParmakIzi());
		
		Gozde gozde = new Gozde();
		gozde.setParmakIzi(578);
		System.out.println(gozde.getParmakIzi());
		
		Sahin sahin = new Sahin();
		sahin.setParmakIzi(963);
		System.out.println(sahin.getParmakIzi());
		
		Seyma seyma = new Seyma();
		seyma.setParmakIzi(456);
		System.out.println(seyma.getParmakIzi());
		
		Yigit yigit = new Yigit();
		yigit.setParmakIzi(753);
		System.out.println(yigit.getParmakIzi());
	}
}

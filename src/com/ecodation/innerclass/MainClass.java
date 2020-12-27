package com.ecodation.innerclass;

public class MainClass {
	
	public static void main(String[] args) {
		UlkeStatic staticOrnek = new UlkeStatic();
		staticOrnek.setUlkeAdi("Türkiye");
		
		Ulke staticOlmayanOrnek = new Ulke();
		Ulke.Iller illerOrnek = staticOlmayanOrnek.new Iller();
		illerOrnek.setIlAdi("Malatya");
		System.out.println(illerOrnek.getIlAdi());
	}
	
}

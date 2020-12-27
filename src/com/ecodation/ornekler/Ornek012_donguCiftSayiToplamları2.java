package com.ecodation.ornekler;

public class Ornek012_donguCiftSayiToplamları2 {
	public static void main(String[] args) {

		System.out.println(2 + 4 + 6 + 8 + 10);

		int sayac = 0;
		for (int i = 2; i <= 10; i = i + 2) {
			sayac = sayac + i;
		}
		System.out.println(sayac);
	}
}

package com.ecodation.ornekler;

public class Ornek013_donguTekSayiToplamları3 {
	public static void main(String[] args) {

		System.out.println(1 + 3 + 5 + 7 + 9);

		int sayac = 0;
		for (int i = 1; i <= 9; i = i + 2) {
			sayac = sayac + i;
		}
		System.out.println(sayac);
	}
}

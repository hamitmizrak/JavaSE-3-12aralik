package com.ecodation.ornekler;

public class Ornek011_donguSayiToplamları {
	public static void main(String[] args) {

		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);

		int sayac = 0;
		for (int i = 1; i <= 10; i++) {
			sayac = sayac + i;
		}
		System.out.println(sayac);
	}
}

package com.dersler;

import java.util.Random;

public class Ders011_Rastgele {
	public static void main(String[] args) {
		// Math static bir yapıdır.
		// Math round object düzeyinde değildir
		System.out.println(Math.random());
		System.out.println(Math.random() * 4 + 1);
		System.out.println(Math.round(Math.random() * 4 + 1));
		System.out.println("-----------------");

		// object düzeyinde
		Random rnd = new Random();
		int rastgele = rnd.nextInt(400) + 1; // 1<= random<= 4
		System.out.println(rastgele);

	}
}

package com.dersler;

import java.io.IOException;

public class Ders030_throw_throws {
	public static void main(String[] args) throws IOException, ArithmeticException, ClassNotFoundException {
		// throws: aşağıda bir yerde bu istisna durumlarıyla karşılaşabilirsin
		int x = 4 / 0;
		System.out.println(x);
		throw new ArithmeticException("Bir sayıyı sıfıra bölemezsin"); // bilerek hata olsun istiyorsam.

		// System.out.println("Sonradan yazılanlar");

	}

}

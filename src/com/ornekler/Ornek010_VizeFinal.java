package com.ornekler;

import java.util.Scanner;

/*
Sınav geçme AA BA CC DC FF
Result>=90 AA
Result>=80 BA
Result>=70 CC
Result>=60 DC
Result= FF
Vize:40%  Final:60%

 */
public class Ornek010_VizeFinal {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		double vizeNotu, finalNotu, sonuc;

		System.out.println("Vize notunu giriniz");
		vizeNotu = klavye.nextDouble();

		System.out.println("Final  notunu giriniz");
		finalNotu = klavye.nextDouble();

		sonuc = (vizeNotu * 40 / 100) + (finalNotu * 60 / 100);
		// System.out.println(sonuc);
		if (sonuc < 60) {
			System.err.println("puanınız: " + sonuc + "FF kaldınız");
		} else if (60 <= sonuc && sonuc < 69) {
			System.err.println("puanınız: " + sonuc + "DC sorumlu geçtiniz");
		} else if (70 <= sonuc && sonuc < 79) {
			System.err.println("puanınız: " + sonuc + " BA Başarılar");
		} else if (80 <= sonuc && sonuc <= 100) {
			System.err.println("puanınız: " + sonuc + "AA Tebrikler");
		} else {
			System.out.println("Lütfen belirtilen aralıklarda sayı giriniz");
		}

	}
}

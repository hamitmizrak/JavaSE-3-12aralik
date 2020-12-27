package com.ecodation.ornekler;

import java.util.Scanner;

/*
tek çift sayı
 */
public class Ornek019_Math {

	public static void mathTutorials() {
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2;

		System.out.println("1. sayı giriniz.");
		sayi1 = klavye.nextInt();

		System.out.println("2. sayı giriniz.");
		sayi2 = klavye.nextInt();

		System.err.println("1.sayı: " + sayi1 + " 2.sayı: " + sayi2);
		System.out.println("Girilen sayılardan en büyüğü:" + Math.max(sayi1, sayi2));
		System.out.println("Girilen sayılardan en küçüğü:" + Math.min(sayi1, sayi2));
		System.out.println("karekök:" + Math.sqrt(Math.max(sayi1, sayi2)));
		System.out.println("mutlak:" + Math.ceil(Math.abs(Math.max(sayi1, sayi2))));
		System.out.println("üslü sayılar:" + Math.pow(sayi1, sayi2));
	}

	public static void main(String[] args) {
		mathTutorials();
	}

}

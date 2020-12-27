package com.ecodation.ornekler;

import java.util.Scanner;

public class Ornek014_HesapMakinesi {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int secim, sayi1, sayi2, sonuc;
		while (true) {
			System.out.println("1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme\n5-)Çıkış");
			secim = klavye.nextInt();
			switch (secim) {
			case 1:
				System.out.println("1.sayıyı giriniz");
				sayi1 = klavye.nextInt();
				System.out.println("2.sayıyı giriniz");
				sayi2 = klavye.nextInt();
				sonuc = sayi1 + sayi2;
				System.out.println("Toplamları: " + sonuc);
				break;
			case 2:
				System.out.println("1.sayıyı giriniz");
				sayi1 = klavye.nextInt();
				System.out.println("2.sayıyı giriniz");
				sayi2 = klavye.nextInt();
				sonuc = sayi1 - sayi2;
				System.err.println("cıkarma: " + sonuc);
				break;

			case 3:
				System.out.println("1.sayıyı giriniz");
				sayi1 = klavye.nextInt();
				System.out.println("2.sayıyı giriniz");
				sayi2 = klavye.nextInt();
				sonuc = sayi1 * sayi2;
				System.err.println("çarpım: : " + sonuc);
				break;
			case 4:
				System.out.println("1.sayıyı giriniz");
				sayi1 = klavye.nextInt();
				System.out.println("2.sayıyı giriniz");
				sayi2 = klavye.nextInt();
				sonuc = sayi1 / sayi2;
				System.err.println("bölme: " + sonuc);
				break;
			case 5:
				System.out.println("Çıkış yapılıyor.");
				System.exit(0);
				break;

			default:
				System.out.println("Lütfen belirtilen seçimi yapınız");
				break;
			}
		}
	}
}

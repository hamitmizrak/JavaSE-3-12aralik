package com.ecodation.ornekler;

import java.util.Random;
import java.util.Scanner;

/*
 konsoldan kaç elemanlı elemanlı bir dizi,
  olacak bu elemanlara rastgele sayılar girilecek
-a) ilk sayı ile son sayının toplamını alalım.
-b) metota verecem metot şunu yapacak girilen sayının 10 küçük olup olmadığını kontol edecek.
 */
public class Ornek017_tekBoyutluDizi {
//1.metot konsoldan elaman alma metodu
	public static int konsolElemani() {
		Scanner klavye = new Scanner(System.in);
		int konsol;
		System.out.println("dizi  eleman sayısı giriniz.");
		konsol = klavye.nextInt();
		return konsol;
	}

	// dizi karişık
	public static void dizi(int sayi) {
		int[] dizi = new int[sayi];
		int toplam = 0;
		double ortalama = 0;
		Random rastgele = new Random();
		for (int i = 0; i < dizi.length; i++) {
			int karisikSayi = rastgele.nextInt(sayi) + 1;
			dizi[i] = karisikSayi;
			ortalama += dizi[i];
		}
		toplam = dizi[0] + dizi[dizi.length - 1];
		System.out.println("ilk sayı ile son sayı toplam:" + toplam);

		System.out.println("Sayıların toplamı:" + ortalama);
		ortalama = ortalama / dizi.length;

		System.out.println("Ortalaması: " + ortalama);
		System.out.println("Yuvarlama: " + Math.ceil(ortalama));

		// forEacgh döngüsü
		for (int temp : dizi) {
			System.err.print(temp + " ");
		}
	}

	public static void main(String[] args) {
		int eleman = konsolElemani();// System.out.println("girdiğiniz sayı:" + eleman);
		dizi(eleman);

	}

}

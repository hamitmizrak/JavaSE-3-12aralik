package com.ecodation.dersler;

public class Ders037_tekboyutlu_diziler {

	public static void main(String[] args) {
//aynı tipteki verileri saklamak üzerinden işlem yapmak isteyebiliriz.

		int sayi2 = 2;
		int sayi3 = 3;
		int sayi4 = 4;
		int sayi5 = 5;
		int sayi6 = 6;
		int sayi7 = 7;

		// dizi =aynı türdeki verileri saklamak
		// statik diziler: boyutu belliyse
		// tek boyutlu diziler
		int[] diziAdi = new int[10]; // 10 elemanlı tek boyutlu dizi
		// 0 1 2 3 4 5 6 7 8 9
		// unutmayalım diziler : 0 (Sıfırdan) başlar
		diziAdi[0] = 0;
		diziAdi[1] = 1;
		diziAdi[2] = 2;
		diziAdi[3] = 3;
		diziAdi[4] = 4;
		System.out.println(diziAdi[3] + diziAdi[2]);
		System.out.println(diziAdi[9]);

		//
		String[] sehirDizi = { "Malatya", "Elazığ", "İstanbul", "Ankara", "Nevşehir", "Bursa" };
		for (int i = 0; i < sehirDizi.length; i++) {
			System.out.print(sehirDizi[i] + " ");
		}
		System.out.println("\nforEach");
		//// forEach
		for (String temp : sehirDizi) {
			System.out.print(temp + " ");
		}

	}
}

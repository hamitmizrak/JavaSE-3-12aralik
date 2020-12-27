package com.ecodation.dersler;

import java.util.Arrays;

public class Ders039_diziArraySort {

	public static void main(String[] args) {

		//
		String[] sehirDizi = { "Malatya", "Elazığ", "İstanbul", "Ankara", "Nevşehir", "Bursa" };

		for (String temp : sehirDizi) {
			System.out.print(temp + " ");
		}
		System.out.println("\n------SIRALANMIŞ-----------");
		Arrays.sort(sehirDizi);
		for (String temp : sehirDizi) {
			System.out.print(temp + " ");
		}

	}
}

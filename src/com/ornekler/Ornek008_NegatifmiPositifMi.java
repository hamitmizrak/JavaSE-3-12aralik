package com.ornekler;

import java.util.Scanner;

public class Ornek008_NegatifmiPositifMi {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int sayi = klavye.nextInt();

		if (sayi < 0) {
			System.out.println("bu bir negatif sayıdır");
		} else {
			System.out.println("Bu bi pozitif sayıdır");
		}
	}
}

package com.ecodation.dersler;

import java.util.Scanner;

public class Ders007_Scanner {
	public static void main(String[] args) {
		String adi;
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen adınızı giriniz");
		adi = klavye.nextLine();

		System.err.println("adınız: " + adi);

		System.out.println("Bildiğiniz diller");
		byte diller = klavye.nextByte();
		System.out.println("Bildiğiniz diller: " + diller);
	}
}

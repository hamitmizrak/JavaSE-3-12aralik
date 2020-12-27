package com.ecodation.ornekler;

import java.util.Scanner;
//import java.util.*;

public class Ornek003_IkiSayiToplami {

	public static void main(String[] args) {
		int sayi2, sayi3, toplam;
		Scanner klavye = new Scanner(System.in);

		System.out.println("Lütfen 1.sayıyı giriniz");
		sayi2 = klavye.nextInt();

		System.out.println("Lütfen 2.sayıyı giriniz");
		sayi3 = klavye.nextInt();

		System.out.println("Toplam: " + (sayi2 + sayi3));

	}
}

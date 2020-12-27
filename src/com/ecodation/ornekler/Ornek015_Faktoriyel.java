package com.ecodation.ornekler;

import java.util.Scanner;

// 4!=4.3.2.1=24
//5!=5.4.3.2.1
public class Ornek015_Faktoriyel {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi1, sonuc = 1;
		System.out.println("Faktöriyel hesabı için sayı giriniz");
		sayi1 = Math.abs(klavye.nextInt());
		for (int i = sayi1; i > 0; i--) {
			sonuc = sonuc * i;
		}
		System.out.println(sonuc);
	}
}

package com.ecodation.ornekler;

import java.util.Scanner;

// asal sayı 1 ve kendisine bölünebilen sayılara denir
//en küçük asal sayı:2
//10=asal değildir  1 10 2 5
public class Ornek016_AsalSayi {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in); // prompt
		int sayi1 , sonuc = 1; // var
		boolean flag = true; // var
		System.out.println("Asal sayı  hesabı için sayı giriniz"); // alert
		sayi1 = klavye.nextInt();
		
		if (sayi1 < 2) {
			System.out.println("2'den küçük asal sayı olamaz");
		} else {
			for (int i = 2; i < sayi1; i++) {
				if (sayi1 % i == 0) {
					flag = false;
					break;
				}
			}
			
			if (flag) {
				System.out.println(sayi1 + " asaldır");
			} else {
				System.out.println(sayi1 + " asal değildir.");
			}
		}
		
	}
}

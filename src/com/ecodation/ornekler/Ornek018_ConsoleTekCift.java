package com.ecodation.ornekler;

import java.util.Scanner;

/*
tek çift sayı
 */
public class Ornek018_ConsoleTekCift {

	public static void tekCift() {
		Scanner klavye = new Scanner(System.in);
		int konsol;
		System.out.println("sayı giriniz.");
		konsol = klavye.nextInt();
		if (konsol % 2 == 0) {
			System.out.println("sayı çifttir");
		} else {
			System.out.println("Sayı tektir.");
		}

	}

	public static void main(String[] args) {
		tekCift();
	}

}

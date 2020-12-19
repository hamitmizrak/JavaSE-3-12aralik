package com.dersler;

import java.util.Scanner;

public class Ders019_KararMekanizması2 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("gün giriniz");
		String gunler = klavye.nextLine();

		if (gunler.equals("pazartesi")) {
			System.out.println("Günlerden Pazartesi");
		} else if (gunler.equals("salı")) {
			System.out.println("Günlerden Salı");
		} else if (gunler.equals("carsamba")) {
			System.out.println("Günlerden carsama");
		} else if (gunler.equals("persembe")) {
			System.out.println("Günlerden persembe");
		} else if (gunler.equals("cuma")) {
			System.out.println("Günlerden cuma");
		} else if (gunler.equals("cumartesi")) {
			System.out.println("Günlerden cumartesi");
		} else if (gunler.equals("pazar")) {
			System.out.println("Günlerden Pazar");
		} else {

			System.out.println("Lütfen belirtilen formatta yazınız");
		}

	}
}

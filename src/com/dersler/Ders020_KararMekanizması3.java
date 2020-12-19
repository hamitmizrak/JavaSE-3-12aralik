package com.dersler;

public class Ders020_KararMekanizması3 {
	public static void main(String[] args) {

		String gunler = "cuma";

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
		} else {
			System.out.println("Günlerden Pazar");
		}

	}
}

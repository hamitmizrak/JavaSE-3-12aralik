package com.ecodation.ornekler;

public class Ornek007_KararMekanizmasıSwitchCase {
	public static void main(String[] args) {

		String gunler = "salı";

		switch (gunler) {
		case "pazartesi":
			System.out.println("Pazartesi");
			break; // methodu kırıyor.

		case "salı":
			System.out.println("salı");
			break;
		case "carsamba":
			System.out.println("carsamba");
			break;
		case "persembe":
			System.out.println("persembe");
			break;
		case "cuma":
			System.out.println("cuma");
			break;
		case "cumartesi":
			System.out.println("cumartesi");
			break;
		case "pazar":
			System.out.println("pazar");
			break;

		default:
			System.out.println("Lütfen belirtilen formatta yazınız");
			break;
		}

		/*
		 * if (gunler.equals("pazartesi")) { System.out.println("Günlerden Pazartesi");
		 * } else if (gunler.equals("salı")) { System.out.println("Günlerden Salı"); }
		 * else if (gunler.equals("carsamba")) {
		 * System.out.println("Günlerden carsama"); } else if
		 * (gunler.equals("persembe")) { System.out.println("Günlerden persembe"); }
		 * else if (gunler.equals("cuma")) { System.out.println("Günlerden cuma"); }
		 * else if (gunler.equals("cumartesi")) {
		 * System.out.println("Günlerden cumartesi"); } else {
		 * System.out.println("Günlerden Pazar"); }
		 */
	}
}

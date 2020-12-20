package com.dersler;

public class Ders036_method {

	// voidli parametresiz method
	public static void methodAdi1() {
		System.out.println("voidli parametresiz method");
	}

	// voidli parametreli method
	public static void methodAdi2(String kelime) {
		System.out.println("voidli parametreli method " + kelime);
	}

	// voidsiz parametresiz method
	public static double methodAdi3() {
		return Math.PI;
	}

	// voidsiz parametreli method
	public static int methodAdi4(int sayi) { // int sayi=parametredir
		return sayi;
	}

	public static void main(String[] args) {
		// void
		methodAdi1();
		methodAdi2("Hamit Mızrak");

		// voidsiz
		double m3 = methodAdi3();
		System.out.println(m3);// System.out.println(methodAdi3());

		int sayi5 = methodAdi4(44);
		System.out.println(sayi5); // sayi5 =argümandır

	}
}

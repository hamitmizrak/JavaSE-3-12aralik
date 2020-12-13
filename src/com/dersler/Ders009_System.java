package com.dersler;

import java.util.Scanner;

public class Ders009_System {
	public static void main(String[] args) {
		System.out.print("devam eder");
		System.out.println("alt satıra geçer");
		System.out.println("alt satıra geçer-2");

		System.err.println("Farklı error rengi");

		Scanner klavye = new Scanner(System.in);

		System.gc();
		System.exit(0); // çıkış yapmak için kullanıyoruz.
	}
}

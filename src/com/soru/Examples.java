package com.soru;

import java.util.Scanner;

public class Examples {

	Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Lutfen dizinin boyutunu giriniz: ");

		int boyut = scan.nextInt();
		int[] a = new int[boyut];
		System.out.println("Lutfen dizinin elemanlarını giriniz:");

		for (int i = 0; i < boyut; i++) {

			a[i] = scan.nextInt();
		}
		System.out.println("dizinin sıralanmamış hali:");
		System.out.print("{");
		for (int i = 0; i < boyut; i++)

		{
			System.out.print(a[i] + " ");
		}
		System.out.print("}");
		Examples ob = new Examples();
		System.out.println(ob);
		System.out.println("\n");

	}
}
package com.ecodation.ornekler;

/*
tek çift sayı
 */
public class Ornek020_DizilerYildiz {

	public static void main(String[] args) {
		String[][] dizi = new String[10][10];
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

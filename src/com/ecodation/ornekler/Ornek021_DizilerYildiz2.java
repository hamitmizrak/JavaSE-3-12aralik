package com.ecodation.ornekler;

/*
tek çift sayı
 */
public class Ornek021_DizilerYildiz2 {

	public static void main(String[] args) {
		String[][] dizi = new String[10][10];
		for (int i = 0; i < dizi.length; i++) {// satır
			for (int j = 0; j < dizi[i].length; j++) { // sutun
				// System.out.print("*");
				if (i > j) {
					System.out.print("*");
				} else if (i < j) {
					System.out.print("+");
				}
			}
			System.out.println();
		}
	}

}

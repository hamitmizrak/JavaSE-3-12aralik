package com.ecodation.dersler;

public class Ders028_break_return_continue {
	public static void main(String[] args) {
		// break=döngüyü çıkış
		// return=methodu kırmak
		// continue = sadece o elemanda çalışma sonrasında döngüyü devam

		// iterative for
		System.out.println("continue");
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(" " + i);
		}
		System.out.println("");
		System.out.println("break döngüyü kırıyor");
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(" " + i);
		}
	}

}

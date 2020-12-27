package com.ecodation.dersler;

public class Ders016_StringSplit {
	public static void main(String[] args) {

		String kelime = "Merhabalar nasılsınız Java";
		String[] dizi = kelime.split(" ");
		for (String temp : dizi) {
			System.out.println(temp);
		}

	}
}

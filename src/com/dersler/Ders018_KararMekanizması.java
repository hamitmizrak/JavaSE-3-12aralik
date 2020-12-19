package com.dersler;

import java.util.StringTokenizer;

public class Ders018_KararMekanizması {
	public static void main(String[] args) {

		String kelime = "Merhabalar nasılsınız Java";

		StringTokenizer stringTokenizer = new StringTokenizer(kelime);
		while (stringTokenizer.hasMoreTokens()) {// kelime içersinde paraçalanacak kelime var mı
			String parcalandi = stringTokenizer.nextToken();
			System.out.println(parcalandi);
		}

	}
}

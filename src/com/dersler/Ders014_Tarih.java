package com.dersler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ders014_Tarih {
	public static void main(String[] args) {
		Locale lokal = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyy hh:mm:ss zzzz", lokal);

		java.util.Date tarih = new Date();
		// Date tarih = new Date();
		System.out.println(tarih);
		System.out.println(tarih.getDate());
		System.out.println(tarih.getMinutes());

		System.out.println();
		String donusturulmusTarih = simpleDateFormat.format(tarih);
		System.out.println(donusturulmusTarih);

	}
}

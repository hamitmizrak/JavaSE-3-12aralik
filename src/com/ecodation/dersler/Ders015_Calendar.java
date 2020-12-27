package com.ecodation.dersler;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Ders015_Calendar {
	public static void main(String[] args) {

		Locale lokal = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyy hh:mm:ss zzzz", lokal);

		Calendar calendar44 = Calendar.getInstance();
		String donusturulmusTarih = simpleDateFormat.format(calendar44.getTime());
		System.out.println(donusturulmusTarih);

	}
}

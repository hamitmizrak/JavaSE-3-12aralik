package com.ecodation.dersler;

public class Ders013_StringBuilder {
	public static void main(String[] args) {
		// Birleştirme
		String str2 = "Merhabalar";
		String str3 = " Nasılsınız";

		String toplam = str2 + str3;
		// System.out.println(toplam);

		// StrinBuilder
		String kelime = "";
		StringBuilder builder = new StringBuilder(kelime);
		builder.append(" ").append(" Java").append(" JSF").append(" JSP").append(" Spring").append(" ");
		String cevirdim = builder.toString();
		System.out.println(cevirdim);
	}
}

package com.ecodation.dersler;

public class Ders006_String {
	public static void main(String[] args) {
		/*
		 * length();,trim(); ,replace(old,new); ,toUpperCase();,toLowerCase();
		 * Cumle.comparateTo(cumle2);,subString(4); subString(0,4); 0<=x<=3
		 * contains();,split();,startsWith(); ,endsWith(); indexOf(); ,charAt();
		 * ,lastIndexOf();,isEmpty(); equals(); ,concat();,equalsIgnoreCase(); == , != ,
		 * (!(s1.equals(s2)) veya (!(s1==(s2))
		 */
		// &bnsp;
		String kelime = "Merhabalar Java Dünyası nasılsın ";
		String kelime2 = "kelime ";
		System.out.println(kelime.length());
		System.out.println(kelime.trim().length());

		System.out.println(kelime.replace("Merhabalar", "how are u"));

		System.out.println(kelime.toLowerCase());
		System.out.println(kelime.toUpperCase());

		System.out.println(kelime.substring(4));
		System.out.println(kelime.substring(1, 5)); // 1 <= x <= 5-1

		System.out.println(kelime.contains("asd"));

		System.out.println(kelime.startsWith("Merhabalar"));
		System.out.println(kelime.endsWith("nasılsın "));

		System.out.println(kelime.indexOf("J"));
		System.out.println(kelime.charAt(0));

		System.out.println(kelime.concat(" son  cümle"));
		System.out.println(kelime.compareTo(kelime2));
		System.out.println("boş mu: " + kelime.isEmpty());

		if (kelime.equals(kelime2)) {
			System.out.println("evet");
		} else {
			System.out.println("hayır");
		}

		if (kelime == kelime2) {
			System.out.println("evet");
		} else {
			System.out.println("hayır");
		}

		System.out.println("------------------");
		String[] kelimeParcalandi = kelime.split(" ");
		for (String temp : kelimeParcalandi) {
			System.err.println(temp);
		}

	}
}

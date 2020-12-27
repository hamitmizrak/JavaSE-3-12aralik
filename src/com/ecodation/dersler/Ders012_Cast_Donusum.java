package com.ecodation.dersler;

public class Ders012_Cast_Donusum {
	public static void main(String[] args) {

		// cast-1
		float f2 = 44.34f;
		long l2 = 15151551L;

		// cast-2 Küçük olanı büyüğünün içise yerleştirdim
		byte b2 = 12;
		long long2 = b2;
		System.out.println(long2);

		// cast -3 büyüğü küçüğün içine yerleştir Dikkat Veri kaybı olacaktır.
		long long3 = 45251155L;
		byte b3 = (byte) long3;

		// primitive türler serileştirilemez ve primitive aynı zamanda null alamaz
		// cast-4 (Boxing)
		// primitive türü wrapper çevir
		int primitiveSayi = 55; // primitive türdür
		Integer wrapperSayi = primitiveSayi; // Boxing
		System.out.println(wrapperSayi);

		// cast -5 (unboxing)
		// wrapperden primitive çevir
		Double wrapperDouble = new Double(44.55);
		double primitiveDouble = wrapperDouble;

		// cast -6 (String'ten sayıya çevir)
		String str = "44";
		int boyutDegistirdi = Integer.valueOf(str);
		int degisken = 22;
		System.out.println(str + degisken);
		System.out.println(boyutDegistirdi + degisken);

		// cast -7 (int'dan String çevir)
		int sayi = 10;
		String cevir = String.valueOf(sayi);
		System.out.println(cevir + 10);

	}
}

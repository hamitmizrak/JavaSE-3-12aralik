package com.ecodation.dersler;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public final class Ders043_Decoder {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir yazı giriniz");
		String yazi;
		yazi = klavye.nextLine();
		
		// sifrelenecek yapı
		Encoder encoder = Base64.getEncoder();
		String sifre = encoder.encodeToString(yazi.getBytes());
		System.out.println("Şifrelenmiş: " + sifre);
		
		// şifre çözücüsü
		Decoder decoder = Base64.getDecoder();
		String sifreCozuldu = new String(decoder.decode(sifre));
		System.out.println("Şifre çözüldü: " + sifreCozuldu);
		
	}
	
}

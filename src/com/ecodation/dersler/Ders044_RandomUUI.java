package com.ecodation.dersler;

import java.util.Scanner;
import java.util.UUID;

public final class Ders044_RandomUUI {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Devam etmek için Bir Tuşa basınız...");
		klavye.hasNextLine();
		
		UUID rastgele = UUID.randomUUID();
		System.out.println(rastgele);
	}
	
}

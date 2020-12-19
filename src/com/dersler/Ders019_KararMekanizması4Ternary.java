
package com.dersler;

public class Ders019_KararMekanizması4Ternary {
	public static void main(String[] args) {
		String gunler = "cuma";
		String result = gunler.equals("cuma") ? "Cuma" : "Başka gün";
		System.out.println(result);
		/*
		 * 
		 * if (gunler.equals("pazartesi")) { System.out.println("Günlerden Pazartesi");
		 * }else { System.out.println("Günlerden Pazar"); }
		 */
	}
}
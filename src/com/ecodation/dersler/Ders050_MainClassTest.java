package com.ecodation.dersler;

public class Ders050_MainClassTest {
	
	public static void main(String[] args) {
		Ders048_HamitGenerics<String> listem = new Ders048_HamitGenerics<String>();
		listem.setAdi("Hamit");
		listem.setSoyadi("Mızrak");
		
		System.out.println(listem.getAdi());
		System.out.println(listem.getSoyadi());
		System.out.println("----------\n");
		
		Ders048_HamitGenerics<String> listem2 = new Ders048_HamitGenerics<String>();
		listem2.setYil("2021 string");
		System.out.println(listem2.getYil());
		
		Ders048_HamitGenerics<Integer> listem3 = new Ders048_HamitGenerics<Integer>();
		listem3.setYil(2021);
		System.out.println(listem3.getYil());
		
	}
}

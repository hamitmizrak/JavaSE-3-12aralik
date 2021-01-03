package com.ecodation.genericsx;

public class MainClassTest {
	
	public static void main(String[] args) {
		HamitGenerics<String> listem = new HamitGenerics<String>();
		listem.setAdi("Hamit");
		listem.setSoyadi("Mızrak");
		
		System.out.println(listem.getAdi());
		System.out.println(listem.getSoyadi());
		System.out.println("----------\n");
		
		HamitGenerics<String> listem2 = new HamitGenerics<String>();
		listem2.setYil("2021 string");
		System.out.println(listem2.getYil());
		
		HamitGenerics<Integer> listem3 = new HamitGenerics<Integer>();
		listem3.setYil(2021);
		System.out.println(listem3.getYil());
		
	}
}

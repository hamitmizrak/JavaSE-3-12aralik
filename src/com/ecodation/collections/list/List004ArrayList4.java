package com.ecodation.collections.list;

import java.util.LinkedList;
//import java.util.List;
import java.util.List;

public class List004ArrayList4 {
	
	public static void main(String[] args) {
		List<String> liste = new LinkedList<String>(); // silme araya yerleşme
		liste.add("Beyza");
		liste.add("Şahin");
		liste.add("Şeyma");
		liste.add("Yiğit");
		liste.add("Hamit");
		
		String isim = "Beyza ";
		String yeniIsim = isim.trim();
		String sonuc = liste.contains(yeniIsim) ? "vardır" : "yoktur";
		System.out.println(sonuc);
		
	}
}

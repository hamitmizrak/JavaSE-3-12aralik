package com.ecodation.collections.list;

import java.util.LinkedList;
//import java.util.List;
import java.util.List;

public class List005ArrayList5 {
	
	public static void main(String[] args) {
		List<String> liste = new LinkedList<String>(); // silme araya yerleşme
		liste.add("Beyza");
		liste.add("Şahin");
		liste.add("Şeyma");
		liste.add("Yiğit");
		liste.add("Hamit");
		
		List<String> liste2 = new LinkedList<String>(); // silme araya yerleşme
		liste2.add("Beyza");
		liste2.add("Şahin");
		liste2.add("Şeyma");
		liste2.add("Yiğit");
		liste2.add("Hamit44");
		
		// boolean result=liste.equals(liste2);
		String sonuc = liste.equals(liste2) ? "vardır" : "yoktur";
		System.out.println(sonuc);
		
	}
}

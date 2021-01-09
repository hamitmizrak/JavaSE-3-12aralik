package com.ecodation.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.List;
import java.util.List;

public class List001ArrayList {
	
	public static void main(String[] args) {
		List<String> liste2 = new ArrayList<String>(); // arama ekleme
		liste2.add("Malatya");
		liste2.add("istanbul");
		liste2.add("Ankarara");
		liste2.add("Trabzon");
		
		List<String> liste = new LinkedList<String>(); // silme araya yerleşme
		liste.add("Beyza");
		liste.add("Şahin");
		liste.add("Şeyma");
		liste.add("Yiğit");
		liste.add("Hamit");
		
		for (String temp : liste) {
			System.out.print(temp + " ");
		}
		
		System.out.println("-------------------");
		
		liste.addAll(liste2);
		for (String temp : liste) {
			System.out.print(temp + " ");
		}
		
	}
}

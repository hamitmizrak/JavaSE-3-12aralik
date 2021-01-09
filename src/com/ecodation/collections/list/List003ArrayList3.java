package com.ecodation.collections.list;

import java.util.LinkedList;
//import java.util.List;
import java.util.List;

public class List003ArrayList3 {
	
	public static void main(String[] args) {
		List<String> liste = new LinkedList<String>(); // silme araya yerleşme
		liste.add("Beyza");
		liste.add("Şahin");
		liste.add("Şeyma");
		liste.add("Yiğit");
		liste.add("Hamit");
		// liste.clear();
		liste.remove(4);
		for (String temp : liste) {
			System.out.print(temp + " ");
		}
		
		System.out.println("\n-------------------");
		
	}
}

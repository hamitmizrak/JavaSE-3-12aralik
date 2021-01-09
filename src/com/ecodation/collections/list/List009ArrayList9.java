package com.ecodation.collections.list;

import java.util.Collections;
import java.util.LinkedList;
//import java.util.List;
import java.util.List;

public class List009ArrayList9 {
	
	public static void main(String[] args) {
		List<String> liste = new LinkedList<String>(); // silme araya yerleşme
		liste.add("beyza");
		liste.add("sahin");
		liste.add("seyma");
		liste.add("yiğit");
		liste.add("hamit");
		
		for (String temp : liste) {
			System.out.print(temp + " ");
		}
		
		System.out.println("---------------\n");
		// Arrays.sort(a);
		Collections.sort(liste);
		for (String temp : liste) {
			System.out.print(temp + " ");
		}
		
	}
}

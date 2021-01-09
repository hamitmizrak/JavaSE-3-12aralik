package com.ecodation.collections.list;

import java.util.LinkedList;
//import java.util.List;
import java.util.List;

public class List008ArrayList8 {
	
	public static void main(String[] args) {
		List<String> liste = new LinkedList<String>(); // silme araya yerleşme
		liste.add("Beyza");
		liste.add("Şahin");
		liste.add("Şeyma");
		liste.add("Yiğit");
		liste.add("Hamit");
		// liste.replaceAll(operator);
		
		System.out.println(liste.indexOf("Şeyma"));
		
		List<String> temp = liste.subList(0, 2);
		for (int i = 0; i < temp.size(); i++) {
			System.out.println(i);
		}
		
	}
}

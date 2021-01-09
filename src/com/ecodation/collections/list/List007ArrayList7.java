package com.ecodation.collections.list;

import java.util.LinkedList;
//import java.util.List;
import java.util.List;

public class List007ArrayList7 {
	
	public static void main(String[] args) {
		List<String> liste = new LinkedList<String>(); // silme araya yerleşme
		liste.add("Beyza");
		liste.add("Şahin");
		liste.add("Şeyma");
		liste.add("Yiğit");
		liste.add("Hamit");
		
		String result = liste.isEmpty() ? "boş" : "dolu";
		System.out.println(result);
		
	}
}

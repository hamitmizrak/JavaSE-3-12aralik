package com.ecodation.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;
import java.util.List;

public class Iterator001 {
	
	public static void main(String[] args) {
		List<String> liste = new ArrayList<String>(); // silme araya yerleşme
		liste.add("beyza");
		liste.add("sahin");
		liste.add("seyma");
		liste.add("yiğit");
		liste.add("hamit");
		
		// forEach
		for (Object temp : liste) {
			System.out.print(temp + " ");
		}
		System.out.println("------------\n");
		
		// Normal for
		for (int i = 0; i < liste.size(); i++) {
			System.out.print(liste.get(i) + " ");
		}
		System.out.println("----------------");
		
		// Iterator
		Iterator<String> ite = liste.iterator();
		while (ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}
		System.out.println("-----------");
		// lambda expression ForEach
		liste.forEach(System.out::print);
		
	}
}

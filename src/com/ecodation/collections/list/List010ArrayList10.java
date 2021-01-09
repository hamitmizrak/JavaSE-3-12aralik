package com.ecodation.collections.list;

import java.util.ArrayList;

public class List010ArrayList10 {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<String>(); // silme araya yerleşme
		liste.add("beyza");
		liste.add("sahin");
		liste.add("seyma");
		liste.add("yiğit");
		liste.add("hamit");
		
		ArrayList<String> kopyalanmis = new ArrayList<String>();
		kopyalanmis = (ArrayList<String>) liste.clone();
		
		for (String temp : kopyalanmis) {
			System.out.print(temp + " ");
		}
		
	}
}

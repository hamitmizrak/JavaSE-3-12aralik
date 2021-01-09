package com.ecodation.collections.list;

import java.util.LinkedList;
//import java.util.List;
import java.util.List;

public class List006ArrayList6 {
	
	public static void main(String[] args) {
		List<String> liste = new LinkedList<String>(); // silme araya yerleşme
		liste.add("Beyza");
		liste.add("Şahin");
		liste.add("Şeyma");
		liste.add("Yiğit");
		liste.add("Hamit");
		
		// 4.sıradaki getir ve boyutu eğer 10 büyükse büyük değilse küçük yazsın
		
		String result = liste.get(3).length() > 10 ? "büyük" : "küçük";
		System.out.println(result);
		
		System.out.println(liste.get(3).length() > 10 ? "büyük" : "küçük");
		
	}
}

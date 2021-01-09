package com.ecodation.collections.list;

import java.util.Vector;

public class List011Vector {
	
	// @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		// aynı anda birden fazla iş yapamıyor.
		Vector<Integer> v1 = new Vector<>(); // default 10
		// Vector<Integer> v1 = new Vector<>(4, 6); // ilk olarak 4 elemanlı sonradan bu
		// 4 10 16 22 28
		// 4 eleman dolarsa üzerine 6 ekle
		
		for (int i = 1; i <= 20; i++) {
			v1.add(i);
		}
		
		v1.forEach(System.out::println);
		
	}
}

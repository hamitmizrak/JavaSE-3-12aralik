package com.ecodation.collections.list;

import java.util.Stack;

public class List012Stack {
	
	// @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		// aynı anda birden fazla iş yapamıyor.
		Stack<Integer> v1 = new Stack<>();
		
		for (int i = 1; i <= 20; i++) {
			v1.add(i);
		}
		
		v1.forEach(System.out::println);
		
	}
}

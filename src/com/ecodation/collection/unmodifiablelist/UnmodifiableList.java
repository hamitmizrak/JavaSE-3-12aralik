package com.ecodation.collection.unmodifiablelist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UnmodifiableList {
	
	public static void main(String[] args) {
		
		List<String> tempList = new ArrayList<String>();
		tempList.add("Beyza");
		tempList.add("Gözde");
		tempList.add("Yiğit");
		
		Iterator<String> list = tempList.iterator();
		while (list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.println("-----------");
		tempList = Collections.unmodifiableList(tempList);
		tempList.add("Hamit");
		
		tempList.forEach(System.out::println);
		
	}
	
}

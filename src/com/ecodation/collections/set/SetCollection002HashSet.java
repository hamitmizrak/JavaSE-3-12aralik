package com.ecodation.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCollection002HashSet {
// H - L - T Tekraksız veriler
	// H=HashSet=tekrasız ve indis sırası önemli değilse , linkedHashSet'e göre
	// hızlı
	// L=LinkedHashSet= tekrarsız ve eklediğimiz indis sırasına göre
	// T=treeSet = tekrarsız küçükten büyüğe doğru elemanları
	public static void main(String[] args) {
		Set<String> setList = new HashSet<String>();
		setList.add("Hamit");
		setList.add("Beyza");
		setList.add("Yiğit");
		setList.add("Şeyma");
		
		for (String temp : setList) {
			System.out.println(temp);
		}
		
	}
}

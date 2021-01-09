package com.ecodation.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCollection003LinkedHashSet {
// H - L - T Tekraksız veriler
	// H=HashSet=tekrasız ve indis sırası önemli değilse , linkedHashSet'e göre
	// hızlı
	// L=LinkedHashSet= tekrarsız ve eklediğimiz indis sırasına göre
	// T=treeSet = tekrarsız küçükten büyüğe doğru elemanları
	public static void main(String[] args) {
		Set<String> linkedHashList = new LinkedHashSet<String>();
		linkedHashList.add("Hamit");
		linkedHashList.add("Beyza");
		linkedHashList.add("Yiğit");
		linkedHashList.add("Şeyma");
		
//		for (int i = 0; i < linkedHashList.size(); i++) {
//			System.out.println(i);
//		}
		
		Iterator<String> ite = linkedHashList.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}

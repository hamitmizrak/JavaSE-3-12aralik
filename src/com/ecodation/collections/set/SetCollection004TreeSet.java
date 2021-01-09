package com.ecodation.collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection004TreeSet {
// H - L - T Tekraksız veriler
	// H=HashSet=tekrasız ve indis sırası önemli değilse , linkedHashSet'e göre
	// hızlı
	// L=LinkedHashSet= tekrarsız ve eklediğimiz indis sırasına göre
	// T=treeSet = tekrarsız küçükten büyüğe doğru elemanları
	public static void main(String[] args) {
		Set<String> treeSetList = new TreeSet<String>();
		treeSetList.add("Hamit");
		treeSetList.add("Beyza");
		treeSetList.add("Yiğit");
		treeSetList.add("Seyma");
		
		Iterator ite = treeSetList.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}

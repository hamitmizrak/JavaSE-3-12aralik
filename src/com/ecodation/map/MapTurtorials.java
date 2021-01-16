package com.ecodation.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
// H=HashTable    H=HashMap   L=LinkedHashMap  T=TreeMap
public class MapTurtorials {
	
public static void main(String[] args) {
	
	Map<Integer, Object> mapListem=new HashMap<Integer, Object>();
	mapListem.put(1, "Beyza");
	mapListem.put(2, "Şahin");
	mapListem.put(3, "Şeyma");
	mapListem.put(4, "Yiğit");
	
	// öncelikle  key yazdırmak
	for(int temp   : mapListem.keySet()  ) {
		System.out.print(temp+" ");
	}
	
	System.out.println("\n--------------- \n");
	
	//value yazdırmak istiyorum.
	for( Object temp   :mapListem.values()  ) {
		System.out.print(temp+" ");
	}
	
	System.out.println("\n------forEach--------- \n");
	
	for(int temp: mapListem.keySet()) {
		Object deger=mapListem.get(temp);
		System.out.println(temp+" "+deger);
		
	}
	
	System.out.println("\n------Lambda---------");
	
	mapListem.entrySet().forEach(System.out::println);
	

	System.out.println("\n--------------- \n");
	//
	Set setMap=mapListem.keySet();
	Iterator ite=setMap.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	
	
	
}

}

package com.ecodation.lambda;

import java.util.ArrayList;
import java.util.List;

//parametresiz voidsiz
//sadece 1 tane soyut method yazmamıza izin veriyor.
@FunctionalInterface 
interface lambdaEx{
	public String method();
}

//parametreli voidsiz
@FunctionalInterface
interface parametreli{
	public String method2(String ad);
	
}

public class LambdaExpressions {
	public static void main(String[] args) {
		
		lambdaEx ex=()->{ return "JavaSE"; } ;
		System.out.println(ex.method());
		
		parametreli deneme2=(nasilsin)->{
			return nasilsin;};
			
			System.out.println(deneme2.method2("deger"));
			System.out.println("--------------");
			List<String> listem=new ArrayList<>();
			listem.add("Malatya");
			listem.add("İstanbul");
			listem.forEach(System.out::println);
		
	}
	
}

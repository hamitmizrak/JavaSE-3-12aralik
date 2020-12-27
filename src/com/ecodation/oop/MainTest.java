package com.ecodation.oop;

public class MainTest {
	
	public static void main(String[] args) {
		// pojo
		PersonPojo pojo = new PersonPojo(); // new ile hafızada yer oluşturdu.
		pojo.setAdi("Hamit");
		pojo.setSoyadi("Mızrak");
		// System.out.println(pojo.getAdi() + " " + pojo.getSoyadi());
		
		// bean
		PersonBean bean = new PersonBean();
		System.out.println(bean);
	}
	
}

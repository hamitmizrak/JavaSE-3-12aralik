package com.ecodation.interfaces;

public class Nokia implements ISozlesme {
	
	@Override
	public void arastir() {
		System.out.println("Nokia Araştır");
		
	}
	
	@Override
	public void avm() {
		System.out.println("Nokia Avm");
		
	}
	
	@Override
	public void urunIncele() {
		System.out.println("Nokia ürün incele");
		
	}
	
	@Override
	public void satinAl(double fiyat) {
		System.out.println("Nokia fiyatı: " + fiyat);
		
	}
	
}

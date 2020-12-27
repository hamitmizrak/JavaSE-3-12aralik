package com.ecodation.interfaces;

public interface ISozlesme {
	
	public void arastir();
	public void avm();
	public void urunIncele();
	public void satinAl(double fiyat);
	
	default void interfaceMethods() {}
}

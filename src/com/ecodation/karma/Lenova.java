package com.ecodation.karma;

public class Lenova extends Bilgisayar implements IUsb {
	// abstract
	@Override
	public void hamitMizrak() {
		System.out.println("Lenova abstract Hamit Mızrak");
		
	}
	
	// interface
	@Override
	public void giris() {
		System.out.println("lenova interface usb giriş");
		
	}
	
	@Override
	public void renk() {
		System.out.println("lenova interface usb renk");
		
	}
	
}

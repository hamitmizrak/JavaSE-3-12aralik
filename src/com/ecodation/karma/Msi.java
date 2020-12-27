package com.ecodation.karma;

public class Msi extends Bilgisayar implements IUsb {
	// abstract
	@Override
	public void hamitMizrak() {
		System.out.println("Msi abstract Hamit Mızrak");
		
	}
	
	// interface
	@Override
	public void giris() {
		System.out.println("msi interface usb giriş");
		
	}
	
	@Override
	public void renk() {
		System.out.println("msi interface usb renk");
		
	}
	
}

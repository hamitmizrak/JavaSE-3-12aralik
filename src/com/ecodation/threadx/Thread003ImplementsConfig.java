package com.ecodation.threadx;

public class Thread003ImplementsConfig implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <=6; i++) {
			System.out.println(i);
		}
		
	}
}
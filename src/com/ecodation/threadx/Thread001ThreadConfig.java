package com.ecodation.threadx;

public class Thread001ThreadConfig extends Thread {

	@Override
	public void run() {
			try {
				for (int i = 1; i <= 10; i++) {
				System.out.println("1.thread "+i);
				Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

	
	
	
	
}

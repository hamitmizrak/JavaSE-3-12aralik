package com.ecodation.threadx;

public class Thread002ThreadConfig2 extends Thread {

	@Override
	public void run() {
			try {
				for (int i = 1; i <= 10; i++) {
				System.out.println("2.thread "+i);
				Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

	
	
	
	
}

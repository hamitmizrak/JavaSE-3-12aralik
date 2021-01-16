package com.ecodation.threadx;

public class MainClass {
	// isimsiz Thread
	public static void isimsizMetodumBen() {
		Thread thread = new Thread( //isimsiz thread
			new Runnable() {
				@Override
				public void run() {
					for (int i = 1; i <= 5; i++) {
						System.out.print(i + " ");
					}
				}
			}
		);
		thread.start();
	}
	
	
	//isimsiz ve  wait metodu
	public static void isimsizveWait() throws InterruptedException {
		Thread thread3=new Thread(
			
			new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i <10; i++) {
					}
				}
			}
			);
		
		thread3.start();//thread başlatır
		thread3.wait();//threadi 2.emre kadar uyutur
		thread3.notify(); //sadece ilgili threadi kaldırır.
		thread3.notifyAll(); //bütün uyuyan threadleri kaldırır.
	}
	
	public static void main(String[] args) throws InterruptedException {
		isimsizMetodumBen();
		
		
		Thread001ThreadConfig config = new Thread001ThreadConfig();
		System.out.println(config.isAlive());
		// config.destroy();
		
		System.out.println(config.getId());
		// config.MAX_PRIORITY
		
		System.out.println(config.getName());
		config.setName("Malatya");
		System.out.println(config.getName());
		
		// config.start();
		System.out.println(config.isAlive());
		
		/*
		 * if(config.isAlive()) { System.out.println("çalışıyor"); }else {
		 * System.out.println("başlıyor"); config.start(); }
		 */
		
		System.out.println(config.getClass());
		System.out.println(config.isInterrupted());
		
		Thread002ThreadConfig2 config2 = new Thread002ThreadConfig2();
		
		config.join();
		config.start();
		config2.start();
		
	}
	
}

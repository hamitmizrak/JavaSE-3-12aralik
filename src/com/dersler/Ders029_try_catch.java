package com.dersler;

import java.io.IOException;

public class Ders029_try_catch {
	public static void main(String[] args) throws IOException, ArithmeticException, ClassNotFoundException {

		try {
			int x = 4 / 0;
			System.out.println(x);
		} catch (ArithmeticException ae) {
			// ae.printStackTrace();
		} catch (Exception e) {
			// e.printStackTrace();
		} finally {
			System.out.println("Ne olursa olsun burası çalışacak db,socket,servisler");
		}

		System.out.println("Sonradan yazılanlar");

	}

}

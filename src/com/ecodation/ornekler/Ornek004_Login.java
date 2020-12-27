package com.ecodation.ornekler;

import java.util.Scanner;
//import java.util.*;

public class Ornek004_Login {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		String dbUserName = "root", dbPassword = "root";

		String scannerUserName, scannerUserPassword;

		System.out.println("Lütfen kullanıcı adını giriniz");
		scannerUserName = klavye.nextLine();

		System.out.println("Lütfen Şifrenizi giriniz");
		scannerUserPassword = klavye.nextLine();

		if ((dbUserName.equals(scannerUserName)) && (scannerUserPassword.equals(dbPassword))) {
			System.out.println("Şifreniz doğru sayfaya yönlendiriiliyor...");
		} else {
			System.out.println("Kullanıcı adı ve şifreniz yanlış");
		}

	}
}

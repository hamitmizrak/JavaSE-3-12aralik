package com.ecodation.iox;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDers4 {
	
	public static void main(String[] args) throws IOException {
		String url="C:\\fileIO\\java se.txt";
		FileWriter fileWriter=null;
		
		try(BufferedWriter  bufferedWriter=new BufferedWriter(new FileWriter(url,true))) {
			bufferedWriter.write("Beyza");
			bufferedWriter.write("Şahin");
			bufferedWriter.write("Şeyma");
			bufferedWriter.write("Yiğit");
			System.out.println("Yazıldı.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

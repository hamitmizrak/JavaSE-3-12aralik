package com.ecodation.iox;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDers {
	
	public static void main(String[] args) throws IOException {
		String url="C:\\fileIO\\java se.txt";
		FileWriter fileWriter=null;
		BufferedWriter bufferedWriter=null;
		
		try {
			fileWriter=new FileWriter(url);
			bufferedWriter=new BufferedWriter(fileWriter);
			bufferedWriter.write("Beyza");
			bufferedWriter.write("Şahin");
			bufferedWriter.write("Şeyma");
			bufferedWriter.write("Yiğit");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			bufferedWriter.close();
		}
		
	}
}

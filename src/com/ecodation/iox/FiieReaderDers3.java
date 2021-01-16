package com.ecodation.iox;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FiieReaderDers3 {
	public static void main(String[] args) {
		try(BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\fileIO\\java se.txt"))) {
		String okunan="";
		String satir="";
		while(   (satir=bufferedReader.readLine())!=null  ) {
			okunan=okunan+satir+" \n";
		}
		System.out.println(okunan+" "+" \n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

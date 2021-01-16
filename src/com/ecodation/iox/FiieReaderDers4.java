package com.ecodation.iox;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FiieReaderDers4 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\fileIO\\java se.txt"))) {
		String okunan="", satir="";
		while(   (satir=bufferedReader.readLine())!=null) {
			okunan=okunan+satir+" \n";
		}
		System.out.println(okunan+" "+" \n");
		} 
	}
}

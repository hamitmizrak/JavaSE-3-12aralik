package com.ecodation.iox;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FiieReaderDers2 {
	
	public static void main(String[] args) {
		BufferedReader bufferedReader=null;
		try {
		bufferedReader=new BufferedReader(new FileReader("C:\\fileIO\\java se.txt"));
		String okunan="";
		String satir="";
		
		while(   (satir=bufferedReader.readLine())!=null  ) {
			okunan=okunan+satir+" \n";
		}
		
		System.out.println(okunan+" "+" \n");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(bufferedReader!=null)
			 {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	
	}
}

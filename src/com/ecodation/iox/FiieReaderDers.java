package com.ecodation.iox;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FiieReaderDers {
	public static void main(String[] args) {
		String url="C:\\fileIO\\java se.txt";
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		try {
		fileReader=new FileReader(url);
		bufferedReader=new BufferedReader(fileReader);
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	}
}

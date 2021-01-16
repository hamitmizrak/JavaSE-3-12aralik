package com.ecodation.iox;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileIO2 {
	
	public static void main(String[] args) throws IOException {
		String url="c:\\fileIO\\";
		
		File file=new File(url);

		//if(file.exists()) {
			
		
	for(File temp   :file.listFiles() ) {
		System.out.println(temp);
	}
		
		
		//}
		
	}
}

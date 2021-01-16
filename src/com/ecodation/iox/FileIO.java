package com.ecodation.iox;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileIO {
	
	public static void main(String[] args) throws IOException {
		String url="c:\\fileIO\\deneme.txt";
		
		File file=new File(url);

		if(file.exists()) {
			
		
		
		//can
		System.out.println("çalışabiliyor mu "+file.canExecute());
		System.out.println("okuyabiliyor mu "+file.canRead());
		System.out.println("yazabilir misin "+file.canWrite());
		
		//is
		System.out.println("bu gizli midir: "+file.isHidden());
		System.out.println("bu bir dosya mıdır: "+file.isFile());
		System.out.println("dizin midir "+file.isDirectory());
		System.out.println(file.isAbsolute());
		
		System.out.println("--------");
		
		
		//get
		System.out.println("absolute Path: "+file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getPath());
		System.out.println(file.getAbsoluteFile());
		System.out.println("ne kadar boş alan var "+file.getFreeSpace());
		System.out.println("toplam hafızan: "+file.getTotalSpace());
		System.out.println("adı: "+file.getName());
		System.out.println("parent file: "+file.getParentFile());
		System.out.println("parent: "+file.getParent());
		System.out.println(file.getClass());
		
		System.out.println("öncesi "+file.lastModified());
		//set
		System.out.println("sonrası: "+file.setLastModified(125525));
		System.out.println(file.setReadOnly());
		
	
		
		//other
		System.out.println(file.exists());
	
		System.out.println(file.lastModified());
		System.out.println(file.length());
		
		System.out.println("-------------------");
		
		Locale locale=new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd MMMM yyyy HH:mm:ss zzzz", locale);
		Date date=new Date(file.lastModified());
		String tarih=simpleDateFormat.format(date);
		System.out.println(tarih);
		



		
		
		}
		
	}
}

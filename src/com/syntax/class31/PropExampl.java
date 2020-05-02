package com.syntax.class31;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropExampl {

	public static void main(String[] args) throws IOException {
		
		String filePath="/Users/beyha/eclipse-workspace/JavaBasics/configs/Exmp.Properties";
	
		FileInputStream fis=new FileInputStream(filePath);	
		

		
		Properties prop=new Properties();
		
prop.load(fis);
	String Browser=prop.getProperty("Browser");
	String url=prop.getProperty("url");

	System.out.println(prop.getProperty("Browser"));
	System.out.println(prop.getProperty("url"));
	
	FileOutputStream fos=new FileOutputStream(filePath);
	
	prop.store(fos,"Added aditional key");
	
		
	}

}

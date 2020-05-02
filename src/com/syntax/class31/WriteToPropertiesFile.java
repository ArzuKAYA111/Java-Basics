package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	
	public static void main(String[] args) throws IOException {
		
		//write into existing file and add values
		
		String filePath= "/Users/beyha/eclipse-workspace/JavaBasics/configs/Examples.properties";
		
		FileInputStream fis= new FileInputStream(filePath);
		
	
		
		Properties prop= new Properties();
	
		prop.setProperty("PhoneNumber", "123456689");
		prop.setProperty("Name", "Juli");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		
		prop.store(fos,"Added aditional key");
		
	}

}

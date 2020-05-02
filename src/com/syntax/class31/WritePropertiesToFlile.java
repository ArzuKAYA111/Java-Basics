package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesToFlile {

	public static void main(String[] args) throws IOException {
		
		
		String filePath="/Users/beyha/eclipse-workspace/JavaBasics/configs/Writing.properties";
		
		FileInputStream fis= new FileInputStream(filePath);
		
		Properties prop= new Properties();
	
		prop.setProperty("PhoneNumber", "123456689");
		
		prop.setProperty("Name", "Juli");
		prop.setProperty("email", "d.saglam23@hotmail.com");
		prop.setProperty("password", "a3587b85");
		
		
		FileOutputStream fos=new FileOutputStream(filePath);
		
		prop.store(fos,"Added aditional key");	
}
}


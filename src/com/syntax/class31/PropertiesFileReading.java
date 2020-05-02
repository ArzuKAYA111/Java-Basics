package com.syntax.class31;
// shortcut for import cntr + shift+0 // for mac command +shif+o
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException  {
	//	to read the file
		
	// 1.have file
		String filePath= "/Users/beyha/eclipse-workspace/JavaBasics/configs/FileReading.properties";

		//2. bring object of FileInputStream
		
	FileInputStream fileInput=new FileInputStream(filePath);
		
		
	// to handle data from properties file we need Property class
	
	
	Properties prop=new Properties();
		prop.load(fileInput);
		
	String Browser= prop.getProperty("Browser");
		System.out.println(Browser);
		
	String url=prop.getProperty("url");	
		System.out.println(url);
		
		String username=prop.getProperty("username");	
		System.out.println(username);	
		
		String password=prop.getProperty("password");	
		System.out.println(password);	
		
		
		System.out.println("........");
		
		
		// getting all keys from property file
		
    	Set<Object> keys= prop.keySet();
	
	//System.out.println(keys);// list olarak tum key leri veriyor
    	
    	
    	// getting all keys from property file 1 by 1 
    	
	  for(Object key:keys) {
		System.out.println(key);  // to get all key 1 by 1
		
		//System.out.println(key+ " : "+ prop.get(key));// to get all entry ( key ,value)  1 by 1
	}
	

	
	
	
	}

}

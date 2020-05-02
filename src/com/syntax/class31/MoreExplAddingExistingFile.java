package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MoreExplAddingExistingFile {

	public static void main(String[] args) throws IOException {
		
		
		//String filePath="C:\\Users\\beyha\\eclipse-workspace\\JavaBasics\\configs\\AddingExistingfile.Properties";
				
		String userDrictory=System.getProperty("user.dir");	
				
	String filePath=userDrictory+"\\configs\\AddingExistingfile.Properties\\";
		
	FileInputStream fis= new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		prop.setProperty("Username", "aydi");
		prop.setProperty("Password", "ay345ln67");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "New Adding Feature");
		
		
		
		
	}

}

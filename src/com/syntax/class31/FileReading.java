package com.syntax.class31;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

public static void main(String[] args) throws IOException {
		
	String filePath="/Users/beyha/eclipse-workspace/JavaBasics/configs/FileReading.Properties";
		System.out.println(filePath);
		
		String userDirectory=System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		String username=System.getProperty("user.name");
		System.out.println(username);
		
		String os=System.getProperty("os.name");
		System.out.println(os);
		
		String filePath1=System.getProperty("user.dir")+"/configs/FileReading.Properties";
		FileInputStream fis=new FileInputStream(filePath1);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(prop.get("url"));
	}
}
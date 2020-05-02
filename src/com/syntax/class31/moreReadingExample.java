package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class moreReadingExample {

	public static void main(String[] args) throws IOException {
		
//	1.Way TO Write FilaPath   	//FilePath i boyle filedan copy paste yaparak direk yazabiliriz yada asagidaki gibi yazariz	
		
		
//		String filePath="C:\\Users\\beyha\\eclipse-workspace\\JavaBasics\\configs\\moreReadexampl.properties";
//			System.out.println(filePath);	
			
//		1.Way TO Write FilaPath 				
				
				
	String userDerectory =System.getProperty("user.dir");			
				
	                                                                 System.out.println(userDerectory);			
				
    String Username =System.getProperty("user.name");			
                                                                      System.out.println(Username);			
    String os=System.getProperty("os.name");
				
                                                                       System.out.println(os);
                                                                       
   String filePath1=userDerectory +"\\configs\\moreReadexampl.properties"  ;                                                              
                                                                       
    FileInputStream fis= new  FileInputStream(filePath1);                                                               
                                                                       
         Properties prop=new Properties();
         prop.load(fis);
                                                                       
       String browser = prop.getProperty("browser");                                                              
       String url = prop.getProperty("url");                                                              
       String username = prop.getProperty("username");                                                              
       String password = prop.getProperty("password");                                                              
                                                                 
       System.out.println(browser);    
       System.out.println(url); 
       System.out.println(username); 
       System.out.println(password); 
     
       System.out.println("......................");
       //butun key ve value lari tek tek ama hepsini okumak istiyorsak
     
       Set<Object > key=prop.keySet();
       for (Object keys:key) {
    	  // System.out.println(keys);// sadece keyler
    	  // System.out.println(prop.get(keys));// sadece value ler
    	 
    	   String keyvalue=keys+":"+prop.get(keys);// key value birlikte
    	   System.out.println(keyvalue);
    	   
    	   
       }
       
       
	}

}

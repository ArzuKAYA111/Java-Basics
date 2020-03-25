package com.syntax.class12;

public class ThreeTasks {

	public static void main(String[] args) {
		/*
		 * 1- Create a String that will hold a sentence. Write a program to get a new
		 * String without any spaces.
		
		 * 2- Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 * 
		 * 3- You have a String a=“Is it saturday? Is it raining? Do we have a Java Class
		 * today?” How would you find out how many sentences are in that String?
		 */
// 1) 
String str=" I like Java Classes";
		
		str=str.replaceAll(" ","");
		System.out.println(str);
		
		//or
		System.out.println(" or ");
		
	String[] str1 = str.split(" ");
	for ( int i=0;i<str1.length; i++)
	
	System.out.println(str1[i]);	
	
	// 2 )
	System.out.println("  2nd   ");
	String sent=" I love 123&895 Java @ Classes";
	
	sent=sent.replaceAll("[^A-Za-z]", "");
	
	System.out.print(sent);
	
//	3)
	
	
	
	
	}

}

package com.syntax.class17;

public class Task3 {
/* Create a method that will accept a String as a parameter and return a new String 
 * that consist only of vowels. Method should be available inside the class where 
 * it was declared and executed by calling it is name.*/ 
	
	
	
	// Method should be available inside the class where  it was declared...> means it will be private.
	
	// executed by calling it is name...> it means it can be static
	
	private static String wovel( String str) {
		
	String	newString;
		
	newString=str.replaceAll("[^AaOoUuEeIi]","");
		
		return newString;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(wovel("CoronaVirus"));//  by using its name (by using only method's name)
		
		System.out.println(Task3.wovel("CoronaVirus")); // by using class name and method name 
		
	}

}

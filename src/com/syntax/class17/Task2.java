package com.syntax.class17;

public class Task2 {
/* Create a method that will take a String as a parameter and returns reverse String.
 *  Method should be available to all classes within your projects and accessible by 
 *  class name.*/
	
	
	
	
	//Method should be available to all classes within your projects  >>>> means it will be public
	
   //accessible by class name....> means it will be Static
	
	public static String rev(String str) {
		
	String reverse=""; 
	
		for ( int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
		}
		return reverse;
		
	}
	public static void main(String[] args) {
	
		Task2.rev("CoronaViruse");
		
		
		System.out.println(Task2.rev("CoronaViruse"));
		System.out.println(rev("CoronaViruse"));// by using only its name can be inside the same class
	}

}

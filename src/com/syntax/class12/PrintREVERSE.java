package com.syntax.class12;

public class PrintREVERSE {

	public static void main(String[] args) {
		/*Create a String and print it in reverse order (Sunday → yadnuS) */
		
		String str="Sunday";
		
		char reverse;
		for( int i=5; i>=0; i--) {
		
		reverse=str.charAt(i);
		System.out.print(reverse);
		
		}
		System.out.println();
		
	//Create a String and if the String is not empty perform the following: 
//	if the String has an odd number of characters and has 3 or more characters,
//	print the character in the middle of the String.
	
		String 	str1="Sundays";
	boolean empty=str.isEmpty();
	if (!empty)	{
	
	if(str1.length()>=3 && str1.length()%2!=0) {
	System.out.println(str1.charAt(3));	
	}
		
	}
	
	
	}

}

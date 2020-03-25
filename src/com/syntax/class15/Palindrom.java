package com.syntax.class15;

public class Palindrom {
//	Create a method that will print whether given String is palindrome or not.
	
	void pal(String word){
		char [] str=word.toCharArray();
		String pald="";
		for (int i=str.length-1; i>=0; i--) {
			pald+=str[i];
		}if (pald.equalsIgnoreCase(word)) {
			System.out.println(word+" is palindrome");
		}else {
			System.out.println( word+ " is not a palindrome");
		}
	}
	
	
	
	public static void main(String[] args) {
		Palindrom word= new Palindrom();
		 word.pal("madam");
		 word.pal("Monday");
	}

}

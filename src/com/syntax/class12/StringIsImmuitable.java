package com.syntax.class12;

public class StringIsImmuitable {

	public static void main(String[] args) {
		

		String str=" Hello ";
		
		String str1=" Hello ";
		
		String str2=" World ";
		str=str.concat(str1);
		System.out.println(str);
		
		
		
		
	}

}

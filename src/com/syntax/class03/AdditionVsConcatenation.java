package com.syntax.class03;

public class AdditionVsConcatenation {
	public static void main(String [] args ) {
		
		
	int a=10;
	int b=20;
	
	String x="Hello";
	 String y= "Bye";
	 //ctrl + space --> aoutocomplete
	 
	 System.out.println(a+b+x+y);  // 30HelloBye
	 System.out.println(a+x+b+y);  // 10Hello
	 System.out.println(x+y+a+b);  // HelloBye10 or HelloBye1020
	 
	 System.out.println(x+y+(a+b));
		
	 
	 System.out.println(a+""+b+x+y);
	}

}

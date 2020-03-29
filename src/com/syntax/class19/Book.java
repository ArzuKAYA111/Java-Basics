package com.syntax.class19;

public class Book {
/*Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed  */
	
	String bookName;
	String Autour;
	int Addition;  
	
    Book (int Addition){
    	
    	this.Addition=Addition;
    	
	System.out.println(" it is "+ Addition + " addition");
		
	}
	Book (String bookName,String Autour){
		this(5);
		System.out.println(" Book name is"+bookName + " it's Autour is" +Autour);
		
	}
	public static void main(String[] args) {
		Book obj=new Book("Fundamentals of English Grammar Student Book A with Essential","Betty s.Azar" );
	}
	
	
}

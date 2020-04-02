package com.syntax.class19;

public class Constructors {

	 Constructors() {
		
		 this(1);// this >>>> constructor call // Always must be 1 line inside the constructor
		 
		 // this (1,2) : CE this is located on 2 line
		 System.out.println("Hi");
		} 
		
		 Constructors(int x) {
			
			 this(1,2);
			 
			 System.out.println("Hello");
		 
			} 
		
	 Constructors(int x, int y) {
			
			
			
			System.out.println(" How are you");
			
		 
			} 
		
		
		
		public static void main(String[] args) {
		// creating an object by passing 2 string values
			Constructors obj =new Constructors() ;	
			
			
	
	
		}
}

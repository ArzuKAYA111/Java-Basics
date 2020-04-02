package com.syntax.class19;

public class ConstructorCall {

	
	public ConstructorCall() {
	 System.out.println(" I am a non argument constructor");
	} 
	
	public ConstructorCall(String str) {
		
		 this();
	
	 
		} 
	
	public ConstructorCall(String str, String str1) {
		
		//this( "str","str") CE....> kemdisi icinde oldugu constructor i call (invoke) yapamaz
		// this (12); CE .....> tek integer li constructor yok olmayan bir constructor cagirilmaz
		 this(str);
		
	 
		} 
	
	
	
	public static void main(String[] args) {
	// creating an object by passing 2 string values
		ConstructorCall obj =new ConstructorCall("Java","Love") ;	
		
		
		
	}
	
}

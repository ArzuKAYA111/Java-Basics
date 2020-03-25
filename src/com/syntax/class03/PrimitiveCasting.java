package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		double d=10;
		System.out.println(d);//10.0
		
	//int i=10.99;  //int i=10.99;	-->compile time error saying:  type missmatch, cannot convert double to int

		
		
		//casting	 in Java is a conversion ( changing from one type to another) of one type into another type
		//primitives and non primitives casting
		
		
	/* There are 2 types of casting primitive types and non primitive
		
	1. widening	(impilict casting, aotomatically)
	
	byte-> short-> ->int->
	
	2.norrowing(explicit casting, manualy) */ //you gone loose some information
		
		
	int i=(int)10.99; 
	System.out.println(i);	//  we made   norrowing(explicit casting, manualy)
	
	//norrowing explicit casting  implementing    //byte  -128 to 127
	
	byte b=(byte)1284;
	
	System.out.println(b);
		
	}

}

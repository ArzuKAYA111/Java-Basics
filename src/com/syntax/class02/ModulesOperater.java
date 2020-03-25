package com.syntax.class02;

public class ModulesOperater {
	public static void main(String[] args) {
		
		float f=12.50f;
		
		float f1=2.5f;
		
		float result=f/f1;
		
		System.out.println(result);
		
		
		int i=12;
		int y=7;
		
		int result1=i/y; //1.0987
		System.out.println(result1);// sonuc 1 verecek int ile yazdigimiz icin
		 
		double result2=i/y;
		float result3=i/y;
		System.out.println(result2);
		
		
		System.out.println(result3);
		
		
	//Modulus
		
		int v=16;	
	    int w=7;
		int mod=v%w;
		System.out.println(mod);
		// i would like to devide 12/7
		//int num1=12.5; not possible to store decimals into it
		double num2=12; // we can store int into double
		
		double num3=7;
		System.out.println(num2); 
		
		System.out.println(num2/num3);
	}

}

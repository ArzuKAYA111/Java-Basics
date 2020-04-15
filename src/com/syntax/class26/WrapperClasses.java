package com.syntax.class26;

public class WrapperClasses {       //  ArrayList DEmo

	public static void main(String[] args) {

int i=10;// int is not an object /class. It is a type. there is no method or anything inside the int type
		
		//auto boxing
		Integer num=10;// Integer is an object/ is an Integer class object. Where Integer Class defined in the compiler.Also it has methods, variables inside it (compiler)
		String s=num.toString();
		System.out.println(num.MIN_VALUE);
		
		Byte b=90;
		System.out.println(b.MIN_VALUE);
		System.out.println(b.MAX_VALUE);
		String s1=b.toString();
		System.out.println(s1);
		
		Boolean bool=true;
		//auto unboxing
		boolean b1=bool;
		System.out.println(b1);
		
	}
}
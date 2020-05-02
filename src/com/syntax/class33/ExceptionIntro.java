package com.syntax.class33;

public class ExceptionIntro {

	public static void main(String[] args) {
		
	int a=10;
	int b=0;// writing 0 is wrong
			
System.out.println(a/b);//	
System.out.println("End of the program");


NullPointerException npe= new NullPointerException();
throw(npe);


	}

}

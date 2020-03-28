package com.syntax.class18;

public class ConstructorsDemo {

	ConstructorsDemo(){
		
		System.out.println(" I am your constructer");   // non argument constructor means it has no any parameters
		System.out.println("This is non argument constructor");
	}

	ConstructorsDemo(String str ){
		
	                                          //Parameterized constructor means it has no any parameters
		System.out.println("I am a constructor with 1 String parameter "+str);
	}
	
ConstructorsDemo(int num){
	 //Parameterized constructor means it has no any parameters
	System.out.println("I am a constructor with 1 integer parameter value "+num );
	} 

ConstructorsDemo(String str ,int num){
	 
	System.out.println("I am a constructor with 2  parameters value "+str+ " "+ num );
	} 



	public static void main(String[] args) {
		
		ConstructorsDemo obj=new ConstructorsDemo();//  to call the constructor this is enough
		new ConstructorsDemo(" Today is Java Class");// to call constructor with parameter string( Parameterized constructor)
		ConstructorsDemo obj1=new ConstructorsDemo(18);
		ConstructorsDemo obj2=new ConstructorsDemo(" Today Java Class " ,18);
	}
}

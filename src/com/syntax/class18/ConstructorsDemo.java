package com.syntax.class18;

public class ConstructorsDemo {
	static String str="Hello";
	
	 ConstructorsDemo(){//if we do not write any access modifier it means it is default
		
		System.out.println(" I am your constructer");   // non argument constructor means it has no any parameters
		System.out.println("This is non argument constructor");
	}
// Access modifiers can use with constructors and they have the same meaning for constructors as methods
	public ConstructorsDemo(String str ){
		
	  //Parameterized constructor means it has parameter
		System.out.println("I am a constructor with 1 String parameter "+str);
	}
	
	protected ConstructorsDemo(int num){
	
	System.out.println("I am a constructor with 1 integer parameter value "+num );
	} 

	private ConstructorsDemo(String str ,int num){
	 
	System.out.println("I am a constructor with 2  parameters value : "+str+ " & "+ num );
	} 

void ConstructorsDemo(){//as soon as we add void or return type --> IT BECOMES a method
	System.out.println("I do not know who am I");
}

	public static void main(String[] args) {
		
		//ConstructorsDemo obj=new ConstructorsDemo();//  to call the constructor this is enough
		new ConstructorsDemo(" Today is Java Class");// to call constructor with parameter string( Parameterized constructor)
		ConstructorsDemo obj1=new ConstructorsDemo(18);
		ConstructorsDemo obj2=new ConstructorsDemo(" Today Java Class " ,18);
		obj1.ConstructorsDemo();// calling method
System.out.println(str); // str is a Static variable it can access (call/ execute) by using only its name because we are in the same class
	}
}

package com.syntax.class18;

public class ConstructorIntro {
	 
//	ConstructorIntro(){
//			
//			      // default constructor
//			}
//	
	// to create a constructor:1 Name must be the same as class name
	                          //2 it does not include return {type not even void}
	
	ConstructorIntro(){
		System.out.println(" I am a constructor ");	
			     
	}
	
	void hello() {
		System.out.println(" Hello class");
	}
	
	
	public static void main(String[] args) {
		
		
		ConstructorIntro obj=new ConstructorIntro();//creating an object and calling a constructor  to call constructor this is enough
		
		System.out.println(" Code after constructor ");
		
		obj.hello(); // Calling methods
		// to call method we need instance ConstructorIntro obj=new ConstructorIntro();and obj.hello() 
		
	}
}

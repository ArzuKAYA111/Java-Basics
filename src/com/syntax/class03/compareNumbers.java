package com.syntax.class03;

public class compareNumbers {

	public static void main(String[] args) {
		
	double numberOne=10;
	double numberTwo=10;
	
	if (numberOne>numberTwo) { 
		
		System.out.println("Double value "+ numberOne+" is larger then double value "+ numberTwo);
	} 
	else if (numberOne<numberTwo){
		
		System.out.println("Double value"+ numberOne+" is smaller then double value "+ numberTwo);
	}
	
	else { 
		System.out.println("Numbers are equal");
		
	}
	

	System.out.println("________________");

	//declear variable for a day and then based on the value we will provide output.
	int day=4;
	
if (day==1) {
		System.out.println("It is Monday, no class today");	
	}
else if (day==2) {
		System.out.println(" It is Tuesday, we have SDLC class");	
	}
else if (day==3) {
		System.out.print("It is Wednesday, we have SDLC class" );	
	}
else if(day==4) {
	System.out.println("It is Thursday, we have Review class");
	}
else if (day==5) {
	System.out.println("It is Friday, no classtoday");
    }
else if (day==6) {
	System.out.println("It is Saturday, we have Java class");
     }
else if (day==7) {
	System.out.println("It is Sunday, we have Java class");
   }
else {
	System.out.println("invalid weekday");
}
	}
	}
	



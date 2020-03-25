package com.syntax.class15;

public class Hello {

// 	Create a method that will say Hello in different language based on the country that will passed when method is executed. 
	
	void sayHello(String country) {
		
		switch(country.toLowerCase()) {
		case "russia":
		System.out.println("Privet");
		break;
		case "turkey":
			System.out.println("Merhaba");
			break;
		case "tajikistan":
			System.out.println("Salom");
			break;
			default:
				System.out.println(" unknown language ");
	
		
	}}
	
	public static void main(String[] args) {
		Hello obj=new Hello()	;
obj.sayHello("russia");
obj.sayHello("Turkey");
obj.sayHello("tajikistan");
	}

}

package com.syntax.class18;

public class Car {

	String make,model, color;
	int year;
	
	// we are defining instance variable
	
	// we will creat a method it will accessall variable
	public void printDetails() {
		
		System.out.println(" I have  "+ year +" " +make+ " "+model+ " "+ color+ " color" );
	}

	public static void main(String[] args) {
		Car car1=new Car(); 
		car1.printDetails();// if we run print give us default values of make model color etc.
		//printDetails()...> constructor gives default values to method
		                // it initialize the variable with default value 
		
		// we are using instance variables without assigning any value
		//constructor initialize all instance variable and assign default values to them
		System.out.println(car1.make);
		
//		int doors;
//		System.out.println(doors);// local variable mut be initialized
		
		
	}
	
	
}

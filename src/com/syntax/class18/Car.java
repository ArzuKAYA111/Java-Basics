package com.syntax.class18;

public class Car {
	// we are defining instance variable
	String make,model, color;
	int year , door , wheels;
	
	
	
	// we will create a method it will accessa ll variable
	public void printDetails() {
		
		System.out.println(" I have  "+ year +" " +make+ " "+model+ " in "+ color+ " color" );
	}

	public static void main(String[] args) {
		Car car=new Car();
		car.make=" BMW";
		car.model=" m5";	
		car.year=2020;
		car.color=" Blue";
		car.door=2;
		car.wheels=5;
		
		car. printDetails();
		
		
		System.out.println("----------------------------");
		
			
		
		
		
		Car car1=new Car(); 
		// if we run print give us default values of make model color etc.
		//printDetails()...> constructor gives default values to method
		                // it initialize the variable with default value 
		
		// we are using instance variables without assigning any value
		//constructor initialize all instance variable and assign default values to them
		System.out.println(car1.year);
		
//		int doors;// door is a local variable
//		System.out.println(doors);// local variable must be initialized
		
		
		
		
	}
	
	
}

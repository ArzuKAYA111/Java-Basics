package com.syntax.class24;

public class Vehicle2Test {

	public static void main(String[] args) {
		
		Car1 Car =new Toyota1("White","Sedan","Toyota");
		Car.drive();
		Car.start();
	  // Car.display();// CE The method display() is undefined for the type Car1
		
		System.out.println("..................");
		
		Vehicle2 Cars =new Toyota1("White","Sedan","Toyota");
		Cars.drive(); 
		Cars.stop();
		
		System.out.println("..................");	
				
		Vehicle2	sB= new schoolBus("Yellow","School Bus");
		sB.stop();
		sB.drive();
	// sB.carry();  // CE The method carry() is undefined for the type Vehicle2
		sB.start();
		sB.brake();
		
		
		System.out.println("..................");
		
		Bus	B= new schoolBus("Yellow","School Bus");
		B.carry();
		B.stop();
		B.drive();
	    B.carry(); 
		B.start();
		B.brake();
		
		System.out.println("..............................with array of vehicle .............");
		
		//Vehicle2 Cars =new Toyota1("White","Sedan","Toyota");
		//Vehicle2	sB= new schoolBus("Yellow","School Bus");
		
		Vehicle2[] 	Vehicles = { Cars,sB };
		for (Vehicle2 V: Vehicles) {
			 V.drive(); 
			 V.stop();	
			 V.start();
			 V.brake();
		}
		
	}

}

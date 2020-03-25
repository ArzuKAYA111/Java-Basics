package com.syntax.class14;

public class Car {  // Class

/*  Car   // Car serves as a Class
 
feature: model, color, 4 wheels, engine, door, make  / we create Template
actions: drive, accelerate, stop, break, make noise   /          Template    */	

	
	//inside the Car Class lets define feature of the car   
	String make;
	String model;          //  Variables
	int year;
	String color;
	int speed;
	
	//define behavior   ( means create the  methods/ specify the behaviors)  
	void drive() {
		System.out.println(make+" can drive");
	}
	
	void accelerate() {
		System.out.println(make+ " can accelerate");     //methods ( must create out side of the main method (public static voice...))
	}
	
	void makeNoise() {
		System.out.println(make+ " make noise");
	}
	
	void stop() {
		System.out.println(make+" stops when you press break");
		System.out.println("Car stops");

	
		
	}
}
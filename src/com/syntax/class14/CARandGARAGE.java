package com.syntax.class14;

public class CARandGARAGE {
	/*  Car   // Car serves as a Class
	 
	feature: model, color, 4 wheels, engine, door, make  / we create Template
	actions: drive, accelerate, stop, break, make noise   /          Template    */	

		
		//inside the Car Class lets define feature of the car   
		String make;
		String model;          //  Variables
		int year;
		String color;
		int speed;
		
		//define behavior       
		void drive() {
			System.out.println(make+" can drive");
		}
		
		void accelerate() {
			System.out.println(make+ " can accelerate");     //methods
		}
		
		void makeNoise() {
			System.out.println(make+ " make noise");
		}
		
		void stop() {
			System.out.println(make+" stops when you press break");
			System.out.println("Car stops");

			}
		public static void main(String[] args) {
		    // build individual objects    // build individual objects according to the feature  from Car class
		    Car car1 = new Car();          // To create objects we need to use new key word
		    car1.make = "Lamborghini";
		    car1.model = "Gallardo";   // object
		    car1.year = 2020;
		    car1.color = "Blue";
		    System.out.println(car1.make);
		    
		    // accessing behavior/methods of Car with car1
		    
		    car1.accelerate();
		    car1.makeNoise();
		    car1.drive();
		    car1.stop();
		    
		    Car car2 = new Car();
		    car2.make = "BMW";
		    car2.model = "m5";   //  object (WE can touch/ change to objects)
		    car2.year = 2019;
		    car2.color = "Pink";
		    
		    // accessing behavior/methods of Car with car2
		    
		    car2.stop();
		    car2.makeNoise();
		    car2.accelerate();
		    car2.drive();

//			Car car3=new Car();	
//			car3.make=123;// error verir cunku Classs ta make i String olarak tanimlamistik
//			car3.speed=200;// error verir cunku class ta speed tanimlamammistik
//			car3.year=2019;
//			car3.color="Pink"
			
		    Car car3 = new Car();
		    car3.make = "123";
		    car3.speed = 200;
		 // print BMW
		    System.out.println(car2.make);
			System.out.println(car1.make);
			// print i drive pink BMW
		    System.out.println("I drive " + car2.color + " " + car2.make);
		   
		    Car2 anotherCar=new Car2();
		    anotherCar.make="Toyota";
		    anotherCar.speed=90;
		    anotherCar.drive();
		    
		    
		    // create bike object
		    // new Bike(); --> cannot create an object if we do not have a class
		    // car2.breaking();CE: method is not defined in car class
		    // I drive pink bmw
		}}

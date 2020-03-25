package com.syntax.class14;

public class Garage {


/* feature: model, color, 4 wheels, engine, door, make  / we create Template
    actions: drive, accelerate, stop, break, make noise   /Template
 */
	/* we created  variables and methods in  Car Class ,outside of the main method
	 * here we will create the objects inside the main methods and we will store the variables*/
public static void main(String[] args) {
    // build individual objects    // build individual objects according to the feature  from Car class
    Car car1 = new Car();          // To create objects we need to use new key word
    car1.make = "Lamborghini";
    car1.model = "Gallardo";   // object
    car1.year = 2020;
    car1.color = "Blue";
    System.out.println(car1.make);
    
    // accessing behavior/methods of Car with car1
    
    // we created methods inside the Car class,  outside the main method( Public static ..) 
    //now we will declare them inside the main method to access( to print /to use) behavior of the class(Car)
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
    
  
//	Car car3=new Car();	
//	car3.make=123;// error verir cunku Classs ta make i String olarak tanimlamistik
//	car3.speed=200;// error verir cunku class ta speed tanimlamammistik
//	car3.year=2019;
//	car3.color="Pink"
	
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
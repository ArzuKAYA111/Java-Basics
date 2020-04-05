package com.syntax.class23;
/* Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 

Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
 */	
public class Computer {

	String make;
	public Computer (String make){
		this.make=make;
	}
		public void run() {
			System.out.println(make+" can run the system");
		}
		public void save() {
			System.out.println(make+" can save input");
		}
		public void transfer() {
			System.out.println(make+" can transfer information");
		}
		public void storage() {
			System.out.println(make+" can store input");
		}
	}


class Apple extends Computer{
	Apple(String make){
		super(make);
	}
	
	
}


class Lenovo extends Computer{
	Lenovo(String make){
		super(make);
	}	
}
class  HP extends Computer{
	HP (String make){
		super(make);
	}	
}


class Dell extends Computer{
	Dell (String make){
		super(make);
	}	
}
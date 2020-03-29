package com.syntax.class19;

public class TestClass  {
public static void main(String[] args) {
	
	Dog dog=new Dog();
// access variables from own class	
	dog.breed="Husky";

	// access variables from parent  class
	dog.color="Grey";
	dog.fur="To much";
	dog.size="Big";
// access methods from own class	
	dog.bark();
	// access methods from Parent class	
	dog.beWild();
	dog.eat();
	dog.sleep();
	Dog.age=2;
	Dog.display();
	
	
System.out.println("---------------------------");	

	Animals animal=new Animals();
//can access only features define within it is class	
	 animal.color="Any";
	 animal.fur="Any";
	 animal.size="Any";
	 
	 animal.beWild();
	 animal.eat();
	 animal.sleep();
	 
 System.out.println("---------------------------");		 
	 Cat cat  = new Cat();
	 cat.bigEyes=true;
	 cat.color="some";
	 cat .fur="some";
	 cat.size="some";
	 
	 cat. play ();
	 Animals.commen();
	 
}
}

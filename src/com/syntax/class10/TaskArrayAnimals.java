package com.syntax.class10;

public class TaskArrayAnimals {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it.
		//Using 2 different loops print all elements from the array.

	// String[] animals= new String[5];
		
		String[] animals= { " Bird", "Rabbit", "Elephant","Mouce","Tiger", "Cow"};
		
	// 1 For advance
		for (String  animal:animals) {
			System.out.println(animal);
		}
		
		
		
	// for regular
		System.out.println("............for regular............... ");
		
		
		for(int i=0; i<animals.length; i++ ) {
			System.out.println(animals[i]);
		}
		
		
		
	}

}

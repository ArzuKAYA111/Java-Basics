package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

/* Create an arraylist of cars and retrieve all the values using 3 different ways.

// Create an arrayList of words. Remove every word that ends with “e”. Use iterator */
public class Car {

	public static void main(String[] args) {
		
		ArrayList<String> Car=new ArrayList<>();
		Car.add("BMW");
		Car.add("Toyota");
		Car.add("Ford");
		Car.add("KIA");
		
//1.Way
		
		for(String Cars :Car) {	
			System.out.println(Cars);
		}
		
		System.out.println("     ");
//	2.WAy
		Iterator<String> IT=Car.iterator();
		while(IT.hasNext()) {
			String element=IT.next();
			System.out.println(element);
		}
		
		
		System.out.println("     ");
		System.out.println("     ");
//3.WAY
		for(int i=0; i<Car.size(); i++) {
			System.out.print(Car.get(i)+";");
		}
		
	}

}

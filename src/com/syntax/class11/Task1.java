package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
		
/*  Create an array of cars : american, german, korean, italian. 
 * Then retrieve all values from that array using 2 different loops
    */	

	String[][]	cars= {
			                {"Doge","Ford","Chevrolet"},
			                {"Bmw","Mercedes","Audi"},
			                {"CIA","Hundai"},
			                {"FIAT","Alfa Romeo"},
	                                 };
		
	int total=0;
	
		for(String [] array:cars) {
			for( String items:array) {   // with for advance loop
				System.out.println(items);
				total++;
			}
		}
		System.out.println("Total cars number " + total);
		
		System.out.println(" ");
		
		for (int rows=0; rows<cars.length;rows++ ) {
			for(int col=0; col<cars[rows].length;col++) {// with regular for loop
			System.out.print(cars[rows][col]+ " ");	
			}
		}
		
	
		
		
		
		
	}

}

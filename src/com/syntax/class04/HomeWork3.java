package com.syntax.class04;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/* Create a Java program that will ask user to input city and temperature.
		 *  Your program should convert Fahrenheit into celsius and 
		 *  print “The temperature is the city __ is __” */

		Scanner input = new Scanner(System.in);

		System.out.println(" Which city do you live?. Pleas enter. ");

		String city = input.next();

		System.out.println("What is the temperature there?");

		int temp = input.nextInt();

		double Celcius = (temp - 32) / (1.8);

		int Celc = (int) Celcius;

		System.out.println(Celcius);
		
		
		System.out.println("                 ");
		
		
		System.out.println(" The temprature of " + city + " is " + Celc);
	}

}

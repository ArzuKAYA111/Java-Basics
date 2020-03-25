package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/* 2- Program to find largest number among three numbers
		 *  using nested if provided by a user (numbers must be distinct) */
		
		// declare needed values
		Scanner scan;
	double val1;
	double val2;
	double val3;
		scan=new Scanner(System.in);
		System.out.println("Please enter a decimal number ");
		val1=scan.nextDouble();
		System.out.println("Please enter a decimal number different then first ");
		val2=scan.nextDouble();
		System.out.println("Please enter a decimal number different then others ");
		val3=scan.nextDouble();
		
		if(val1>val2) {
		
		 if(val2>val3 )
			 System.out.println("the largest value is the first value: "+ val1);
		  else  {
			 System.out.println("the largest value is the third value: "+ val3);
		 }}
		 
		else System.out.println(" You have not entered distinct numbers ");	
	}

}

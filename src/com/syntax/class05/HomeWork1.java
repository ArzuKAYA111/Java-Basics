package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		
	/*  1- Write a program to find largest of three double values 
	 * using if-else..if and logical operators 
	 * provided by a user (numbers must be distinct) 	
	 */
		/* 2- Program to find largest number among three numbers
		 *  using nested if provided by a user (numbers must be distinct) */
		
		// declare needed values
		Scanner scan;
	double val1; 	double val2;   double val3;
	
		scan=new Scanner(System.in);
		System.out.println("Please enter a decimal number ");
		val1=scan.nextDouble();
		System.out.println("Please enter a decimal number different then first ");
		val2=scan.nextDouble();
		System.out.println("Please enter a decimal number different then others ");
		val3=scan.nextDouble();
		
		if(val1>val2 && val1>val3) {
		System.out.println("the largest value is the first value: "+ val1);
		}
		else if(val2>val1 && val2>val3 )
		{
			System.out.println("the largest value is the second value: "+ val2);
			}
		else if(val3>val1 && val3>val2 )
		{
			System.out.println("the largest value is the third value: "+ val3);
		}
		else System.out.println(" You have not entered distinct numbers ");	
		
		
		System.out.println("...............");
		
	double	largest=0;  // logical opearator(&&, ||, !)  kullanmadan if else  ile yap

	
		if (val1>val2 ) {
			if( val1>val3  )
			{
				largest=val1;
			}else {
				largest=val3;
			}
			
		}else {
			if(val2>val3)
			largest=val2;
			else {
				largest=val3;
			}
			
		System.out.println("The largest number is "+ largest);
		
	}
	}

}

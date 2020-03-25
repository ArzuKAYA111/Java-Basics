package com.syntax.class05;

import java.util.Scanner;

public class Task1HeightInInc {

	public static void main(String[] args) {
		 
/*Task Prompt the user to enter person heights in inches.
 *  Person should be classified as one of the following:
short (under 60 inch)
medium(between 60 -72 inch)
tall (over 72 inch)*/
		
		Scanner scan=new Scanner(System.in);
	System.out.println(" Please enter your heigt in 'inch' unit ");	
		
	float height=scan.nextFloat();
	
	if (height>=0 && height<65) 
		System.out.println("Your height is "+ height+ " inch ...> short ");
		
	else if((height>=60)&&(height<= 72)) 
		System.out.println("Your height is "+ height+ " inch ...> medium");
	
	else if (height>72) 
		System.out.println("Your height is "+ height+ " inch ...> tall");
	
	


	}

}

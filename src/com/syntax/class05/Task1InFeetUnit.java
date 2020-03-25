package com.syntax.class05;

import java.util.Scanner;

public class Task1InFeetUnit {

	public static void main(String[] args) {
		/* Logical Operators
        && - AND 
		  || - OR 
		   ! - NOT
		 */
/*Task 2. Prompt the user to enter person heights in
feet. Person should be classified as one of the
following:
• short (under 5 feet)
• medium(5 to 6 feet)
• tall (6 feet and over*/
		
		Scanner scan=new Scanner(System.in);
	System.out.println(" Please enter your heigt in 'feet' unit ");	
		
	float height=scan.nextFloat();
	
	if (height<5) 
		System.out.println(" short ");
		
	else if((height>=5)&&(height< 6)) 
		System.out.println("medium");
	
	else if (height>=6) 
		System.out.println("tall");
	
	}
}

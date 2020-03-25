package com.syntax.class12;

import java.util.Scanner;

public class NameCreatNameWithConcat {

	public static void main(String[] args) {
		/*Write a program that reads two people’s first names 
		 * and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL */
	 // programdan al 
	Scanner scan; scan=new Scanner(System.in);
	String namemother="";
	String namefather="";
	boolean boy=true;
	String 	partialString1="";
	String partialString2="";		
		System.out.println("Please enter mother first name" );
		namemother=scan.nextLine();
		System.out.println("Please enter father first name" );
		namefather=scan.nextLine();
		
	if (boy) {
		String nameString1=namefather.substring(0, 3);
		String nameString2=namemother.substring(2);
		System.out.println(nameString1+nameString2 );
	}
	else if (!boy) {
		String nameString1=namefather.substring(0, 3);
		String nameString2=namemother.substring(2);
		System.out.println(nameString2+ nameString1);
	}
	
	
	}

}

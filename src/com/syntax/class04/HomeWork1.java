package com.syntax.class04;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*You are a loan specialist and you need to ask user 
		 * what is the amount of loan is needed.
		 *  If loan is less than 200,000 then you would lend the money
		 *   otherwise you would reject the client. */
		 
     Scanner loan=new Scanner(System.in);

	
	System.out.println("How much loan do you need ");
	
	int value=loan.nextInt();
	
	if(value<200000) {
		System.out.println("You can get $"+ value);
	
	}
	else {
		System.out.println(" Sorry! I can not help you ");
	}
	}}

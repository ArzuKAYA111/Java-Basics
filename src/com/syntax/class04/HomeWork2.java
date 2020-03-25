package com.syntax.class04;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*You are DMV representative and you need to ask customer their age.
		 *  If they are 18 and older you will issue a driver licence to them, 
		 *  otherwise you will offer them to get a learners permit.
		  */
 Scanner input=new Scanner(System.in);
 
 System.out.println(" Please enter you age");
 
 int age=input.nextInt();
 
 if (age>=18) {
	 

	 System.out.println("you can get a licence");
 }
 else {
	 System.out.println("Your age is under 18, you can get a learner permit");
 }
 
 
	}

}

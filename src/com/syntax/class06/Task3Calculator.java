package com.syntax.class06;

import java.util.Scanner;

public class Task3Calculator {

	public static void main(String[] args) {
		/* HomeWork: Using scanner class create calculator. Allow user to enter 2
		 * numbers and operator(+,-,*,/). Based on operator provide the result to user.  */

		int num1;    int num2;   Scanner scan;    char operator;    double result = 0.0;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter a number ");
		num1 = scan.nextInt();
		System.out.println("Please enter another number ");
		num2 = scan.nextInt();
		System.out.println("Please enter an operator type ");
		operator = scan.next().charAt(0);

		switch (operator) {

		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:

			System.out.println("You entered invalid operator");
		}
		if( result !=0.0) { // !!!!!  yazarsak sonuc hesaplanmadigi durumlarda sondaki hesaplama printini basmaz
			
		System.out.println("Result of your operation " + num1 + operator + num2 + " is equlas " + result);
		}
		}
}

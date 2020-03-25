package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Logical Operators && - AND || - OR ! - NO
Write a program that will print whether it is a weekend or weekday. 
If any day from 1-5 →output “It is a weekday�?,
 any day from 6-7 →output “It is a weekend�?, 
 any other day →output“Invalid day�?
	
		 */
		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter day number");
	
		//1.yol	Scanner ile
		int day=inp.nextInt();  
		
		if (day >= 1 && day <= 5) {
			System.out.println("It is a weekday");

		}else if (day == 6 || day == 7) {
			System.out.println(" It is a weekend");
	}
	else {
			System.out.println("Invalid day");
	}
		System.out.println(".......");
		//2. yol kendin deger vererek
		int day1=4;
		 if (day1 >= 1 && day1 <= 5) {
			System.out.println("It is a weekday");

		}else if (day1 == 6 || day1 == 7) {
			System.out.println(" It is a weekend");
	}
	else {
			System.out.println("Invalid day");
	}
		 System.out.println("......."); 
		 
	//3.yol Scanner ile diger bir yazilis (or kullanarak)
		
			
			if (day==1||day==2||day==3||day==4||day==5) {
				System.out.println("It is a weekday");

			}
			else if (day == 6 || day == 7) {
				System.out.println(" It is a weekend");
		} else {
			System.out.println("Invalid day");
	}
	}
}

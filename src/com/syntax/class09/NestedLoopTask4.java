package com.syntax.class09;

import java.util.Scanner;

public class NestedLoopTask4 {

	public static void main(String[] args) {
		/*
		 * Write a guessing game where the user has to guess a secret number between 1
		 * and 20. After every guess input, the program tells the user whether their
		 * number was too large or too small. The program will keep asking the user to
		 * enter the number until he finds the correct number. When the correct answer
		 * is found the system should display "Congratulations!!. You got it!"
		 
		 */

		Scanner scan;
		int inputNum;
		int trueNum = 8;
		scan = new Scanner(System.in);

		do {
			System.out.println(" Please enter a number between 1-20 ");
			inputNum = scan.nextInt();
			if (inputNum >= 14) {
				System.out.println( inputNum + " was too large");
			}
			else if (inputNum <= 4) {
				System.out.println( inputNum + " was too small");
			
			}else if(inputNum==8) {	
			break;
			
			} else {
				System.out.println( inputNum + " was close to the correct number");
			}
			
		} while ( trueNum!=inputNum);
		System.out.println("Congratulations!!. You got it!");
	
		System.out.println("           ");
		
		// 2.WAY I am going to do
//		
//		do {
//			System.out.println(" Please enter a number between 1-20 ");
//			inputNum = scan.nextInt();
//			if (inputNum >= 14) {
//				System.out.println("Entered number " + inputNum + " was too large");
//			}
//			else if (inputNum <= 4) {
//				System.out.println("Entered number " + inputNum + " was too small");
//			
//			}else if(inputNum==8) {	
//			break;
//			
//			} else {
//				System.out.println("Entered number " + inputNum + " was close to the correct number");
//			}
//			
//		} while ( trueNum!=inputNum);
//		System.out.println("Congratulations!!. You got it!");
//		
//		

	}}

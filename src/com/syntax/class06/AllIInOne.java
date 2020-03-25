package com.syntax.class06;

import java.util.Scanner;

public class AllIInOne {

	public static void main(String[] args) {
		/*
		 * write a program to ask user if there is a sale if no sale ....>not going
		 * shopping if sale we will ask the price of the item based on the price we will
		 * apply discount and calculate final price
		 * 
		 * if price less then 2o...>apply 10% 
		 * if price between 20 and 100 ....>apply 20%
		 * if price between 100 and 500 ....>apply 30% if price more then 500 ....>apply
		 * 50%
		 */

		Scanner scan;
		String sale;
		double price;
		double discount=0;
		double finalPrice=0;

		scan = new Scanner(System.in);
		System.out.println("Is there sale? ");
		sale = scan.next();
		if (sale.equals("Yes")) {
			System.out.println("What is the price of item");
			price = scan.nextDouble();
			if (price < 20) {
				discount = price * 0.10;
				System.out.println("Final price is " + (price - discount));
			}

			if (price > 20 && price < 100) {
				discount = price * 0.20;
				System.out.println("Final price is " + (price - discount));
			}
			if (price > 100 && price < 500) {
				discount = price * 0.30;
				System.out.println("Final price is " + (price - discount));
			}

			if (price > 500) {
				discount = price * 0.50;
				System.out.println("Final price is " + (price - discount));
			}
		} else {
			System.out.println("Not going shopping ");
		}

   }
  }  
	
	
	



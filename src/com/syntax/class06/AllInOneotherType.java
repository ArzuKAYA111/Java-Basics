package com.syntax.class06;

import java.util.Scanner;

public class AllInOneotherType {

	public static void main(String[] args) {
		/*
		 * write a program to ask user if there is a sale 
		 * if no sale ....>not going shopping 
		 * if sale we will ask the price of the item based on the price we will apply discount and calculate final price
		 * 
		 * if price less then 2o...>apply 10%
		 *  if price between 20 and 100 ....>apply 20%
		 * if price between 100 and 500 ....>apply 30% 
		 * if price more then 500 ....>apply
		 * 50%
		 */

		Scanner scan;
		String sale;
		double price;
		double discount;
		double finalPrice;
		
		scan=new Scanner(System.in);
		
		System.out.println("Is ther sale ?");
		
		sale=scan.nextLine();
		
		if(sale.equalsIgnoreCase("yes")) {
		System.out.println("What is the price ");
		price=scan.nextDouble();
		
		        if(price<20) {
		        	discount=price*0.10;
		        }else if(price>20 && price<=100) {
		        	discount=price*0.20;
		        }else if(price>100 && price<=500) {
		        	discount=price*0.30;
		        }else {
		        	discount=price*0.50;
		        }
		            finalPrice=price-discount;
		
		System.out.println("After " +discount + " discount the price of the item is "+ finalPrice);
		
		
		}else {
			System.out.println(" I am not going to shopping ");
		}
		

	}

}

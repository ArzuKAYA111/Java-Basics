package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
	
	/* Declare a number and compare if number is larger then 100
	 *  if number is larger then 100	--> myNumber  is large
	 */
		System.out.println("Starting coding");
		
	int num=178;
	
	if(num>100) {
		
		System.out.println("My number is large");// buradaki {  } if cond. a bagli
	}
		
		
	System.out.println("End of the program");
	
	
	System.out.println("---------------");
	
		int expectedHours=15;
		int actualHours=4; // 15 yazarsak you will love java verecek
		//if actual is more then expected-->you will love  java
		
	if(actualHours>=expectedHours) {
		
		System.out.println("you will love java");
	}else {//otherwise (if false)-->go inside else block
		System.out.println("you will not like java");
	}
		
	System.out.println("---------------");
	
		double budget=1000;
		double carPrice=12000;
		
		if(budget>carPrice) {
			System.out.println("I will buy this car today");
			System.out.println("I will be Happy");
			
		} 		
		else {
			System.out.println("I will not buy this car today," + "I will go learn java");
			System.out.println("I will be motivated");
			
		}
		
				
				System.out.println("I am code after if condition");
	}
	
		
	}



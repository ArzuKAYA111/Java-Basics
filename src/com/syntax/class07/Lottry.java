package com.syntax.class07;

import java.util.Scanner;

public class Lottry {

	public static void main(String[] args) {
		//We are playing a lottery and a lucky number is 17;
		//we want to keep asking user any number from 1-20;
		// until he guess the lucky number ____> congrats;
		
		
		// while ile
		
		Scanner scan; scan=new Scanner(System.in);
		int lotrynum=0;
	
		while(lotrynum<=17) {
			System.out.println("Please enter number between 1-20 ");
			lotrynum=scan.nextInt();
			
		if(lotrynum==17) {                                              //   if(num>12 && num<20){
			System.out.println("Congrats you win ");                    //   	System.out.println("Please enter number between 1-20 ");  
			                                                            //  {  yaparsak limitsiz sekilde sorar ve degerlendirir 17 yi bulana kadar
		}
		lotrynum++;
		
		}
		
		System.out.println("___________________");
		
		// do while ile
		int luckyNumber=17;
		int number;
		do {
			System.out.println("Please enter number between 1-20 ");
			number=scan.nextInt();
			
		}while (luckyNumber!=17); {
			System.out.println("You Got It !! ");
			
		}
	}

}

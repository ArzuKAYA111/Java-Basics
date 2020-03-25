package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/* Write a program that reads a range of integers (start and end point),
		 *  provided by a user and then from that range prints the sum of the even and odd integers.
*/
Scanner scan;
scan=new Scanner(System.in);
		
	

int rangeI=0;
int rangeF=0;


System.out.println("Please enter your range numbers ");
rangeI=scan.nextInt();
rangeF=scan.nextInt();
	for (int a=rangeI;a<=rangeF; a++) {
		
		int evenSum=0;
		//int oddSum=0;
		if(a%2==0) {
			evenSum=evenSum +a;
			System.out.print(evenSum);	
		//}if (a%2!=0) {
			//evenSum=rangeI +a++;
		}
		//System.out.print(oddSum);		
	}
	
	
	
	
	
	
	
	}

}

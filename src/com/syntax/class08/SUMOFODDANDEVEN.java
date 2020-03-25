package com.syntax.class08;

public class SUMOFODDANDEVEN {

	public static void main(String[] args) {
	
		// write a program to calculate sum of Odds and sum of even numbers 1 to 99
		
		// 1 .args WaY
		
		int addOdd=0;
		int addEven=0;
		for(int i=1; i<=99; i++) {
			if(i%2!=0) {
			addOdd=addOdd+i;
			}else {
				addEven=addEven+ i;
			}
		}

		System.out.print("Sum of odd numbers " +addOdd );
		
		System.out.println("                ");
	
		
		System.out.print("Sum of eve numbers " +addEven );
		
		
		
		
		
		
		
		
		
	}

}

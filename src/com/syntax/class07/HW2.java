package com.syntax.class07;

public class HW2 {

	public static void main(String[] args) {
		
		/*Print numbers from 100 to 1
 */
		//FIRST WAY
		
		int num=100;
		
		while(num>=0) {
		
			System.out.print(num +" ");
			num--;	
		}
		System.out.println(".................... ");
		
		System.out.println("....................");
		
		// SECOND WAY
	
	for( int y=100; y>=1; y--) {
	System.out.print(y+ " ");
	}
	
	System.out.println("                           ");
	System.out.println("............................");
	
	// 3 WAY
	
	int no=100;
	do {
		System.out.print(no +" ");
		no--;
	}while(no>=1);
	
	
	}

}

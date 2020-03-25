package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {

//5 * vertical
		for (int a=1; a<=5; a++)
			System.out.println("*");
		
		System.out.println("...................2 ");
		
	// 5 * horizantal 			
		for (int a=1; a<=5; a++)
			System.out.print("*");	
		
		
		System.out.println(".......................................3 ");
		System.out.println("Priting pattern using nested loop ");
	
	/* *****
	 * *****
	 * *****	
	 * *****
	 */
		for( int row=1; row<=5; row++) {
			for ( int colum=1; colum<=5; colum++) {
			System.out.print("*");	
			}
			System.out.println();
		}
		
			
		System.out.println("...........PRINTING *  10X10 PATTERN.4.................");
		
	for(int row=1; row<=10; row++)	{
		
		for( int colum=1; colum<=10; colum++) {
			System.out.print("*");
		}
		System.out.println();	
	}

	
	
	

	}

}

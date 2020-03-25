package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
		// 1 -5  raws
		// 5  colums

	for(int row=1;  row<=5;  row++)	{                      //12345 
			                                               //12345
			for( int colum=1; colum<=5; colum++) {         //12345
				System.out.print(colum+ " ");              //12345
			}                                              //12345
			System.out.println();	
		}
	System.out.println(" ... ................... 2 ");
  /*  1 2 3 4 5 6 7 8 9 
      1 2 3 4 5 6 7 8 9 
      1 2 3 4 5 6 7 8 9 
      1 2 3 4 5 6 7 8 9 
      1 2 3 4 5 6 7 8 9 */
	// 1-9  raws 
	// 5 colum
	for(int row=1; row<=5; row++)	{
		
		for( int colum=1; colum<=9; colum++) {
			System.out.print(colum+ " ");
		}
		System.out.println();	
	}
	
	System.out.println(" ... ................... 3 ");

		// 5 5 square 1.Way
	for(int row=1; row<=5; row++)	{
			
			for( int colum=5; colum>=1; colum--) {
				System.out.print(colum+ " ");
			}
			System.out.println();	
		}
		
	//5 5 square 2.Way

	System.out.println(" ... ................... 4 ");
		
	for(int row=1; row<=5; row++)	{
			
			for( int colum=1; colum<=5;colum++) {
				System.out.print(row+ " ");
			}
			System.out.println();	
		}

	//5 5 square 3.Way

		System.out.println(" ... ................... 5  ");
			
		for(int row=5; row>=1; row--)	{
				
				for( int colum=1; colum<=5;colum++) {
					System.out.print(row+ " ");
				}
				System.out.println();	
			}
	
	
	}

}

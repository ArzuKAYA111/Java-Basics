package com.syntax.class09;

public class Pyramid {

	public static void main(String[] args) {
		// Triangle 1.Way

		System.out.println(" .................1");
		
	for(int row=1; row<=5; row++)	{
			
			for( int colum=1; colum<=row; colum++) {
				System.out.print(colum+ " ");
			}
			System.out.println();	
		}
	//Triangle 2.Way

		System.out.println(" ................. 2");
		
	for(int row=1; row<=5; row++)	{
			
			for( int colum=1; colum<=row; colum++) {
				System.out.print(colum+ " ");
			}
			System.out.println();	
		}

	//Triangle 3.Way

		System.out.println(".  ...................3 ");
		
	for(int row=5; row>=1; row--)	{
			
			for( int colum=1; colum<=row; colum++) {
				System.out.print(colum+ " ");
			}
			System.out.println();	
		}	
	//Triangle 4.Way

		System.out.println("...................4 ");
		
	for(int colum=5; colum>=1; colum--)	{
			
			for( int row=1; row<=colum; row++) {
				System.out.print(colum+ " ");
			}
			System.out.println();	
		}	

	//Triangle * 1 .Way

		System.out.println("   ..................5.");
		
	for(int colum=5; colum>=1; colum--)	{
			
			for( int row=1; row<=colum; row++) {
				System.out.print( "* ");
			}
			System.out.println();	
		}	

	//Triangle * 2 .Way

		System.out.println("  .................6.");
		
	for(int row=1; row<=5; row++)	{
			
			for( int  colum=1; colum<= row;  colum++) {
				System.out.print( "* ");
			}
			System.out.println();	
		}

	//* ARROW

	System.out.println("  .................7 .");

	for(int colum=1; colum<=5; colum++)	{
			
			for( int row=1; row<=colum; row++) {
				System.out.print( "* ");
			}
			System.out.println();	
		}for(int colum=4; colum>=1; colum--)	{
			
			for( int row=1; row<=colum; row++) {
				System.out.print( "* ");
			}
			System.out.println();	
		}
		
	System.out.println("                     ");
	
		
	for(int colum=5; colum>=1; colum--)	{
		
		for( int row=1; row<=colum; row++) {
			System.out.print( "* ");
		}
		System.out.println();	
	}for(int colum=1; colum<=4; colum++)	{
		
		for( int row=1; row<=colum; row++) {
			System.out.print( "* ");
		}
		System.out.println();	
	}
	
	System.out.println("                     ");
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

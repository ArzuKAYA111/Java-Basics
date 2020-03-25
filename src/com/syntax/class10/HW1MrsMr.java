package com.syntax.class10;

public class HW1MrsMr {

	public static void main(String[] args) {
		/*Create a 2D array where you will store the following values:  Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		After storing values print the following: Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.*/
		
 System.out.println("...........Short Way................");
 
		String[][] names= { 
			             	{"Mr","Mrs","Ms","Miss"},
				            {"Smith","Jordan","Jackson","Obama"}    };
		
		System.out.println(names[0][1]+" "+ names[1][0]);
		System.out.println(names[0][0]+" "+ names[1][3]);
		System.out.println(names[0][2]+" "+ names[1][2]);
		System.out.println(names[0][3]+" "+ names[1][1]);
		
		 System.out.println("...........Long Way................");
		 
		String[][] name=new String[4][4];
		
//	1 ROWS 
		name[0][0]="Mr";
		name[0][1]="Mrs";
		name[0][2]="Ms";
		name[0][3]="Miss";		
// 2 ROWS
	
		name[1][0]="Smith";
		name[1][1]="Jordan";
		name[1][2]="Jackson";
		name[1][3]="Obama";
		
		System.out.println(name[0][1]+" "+ name[1][0]);
		System.out.println(name[0][0]+" "+ name[1][3]);
		System.out.println(name[0][2]+" "+ name[1][2]);
		System.out.println(name[0][3]+" "+ name[1][1]);
			
	// print all values of array	
		 System.out.println("...........PRINT ALL VALUES................");
		for(int row=0; row< name.length; row++) {
			for( int colum=0; colum<names[row].length; colum++) {
				System.out.println(names[row][colum]+ " ");
			}
				
		}
		
	}

}

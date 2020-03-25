package com.syntax.class10;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		
	int [] [] numbers =new int[3][4];
	
	//1st  row 
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		
	// 2 row 	
		
		numbers[1][0]=5;
		numbers[1][1]=10;
		numbers[1][2]=15;
		numbers[1][3]=20;
		
		
		//3 row 	
		numbers[2][0]=1;
		numbers[2][1]=2;
		numbers[2][2]=3;
		numbers[2][3]=3;

		System.out.println("       print value 15         ");
		
// print value 15 
System.out.println(numbers[1][2]);

		System.out.println("       PRINT OUT ANY VALUES         ");
		
		
int [] [] nums= {               //  array of 3 single dimensional arrays
		
		{ 10,20,30,40},
		{5,10,15,20},
		{ 1,2,3}
		
       }; 

	//System.out.println(nums[2] [3]);// hata verir cunku 3.colum yok 	
	
	System.out.println(nums[0] [2]);	// output ..> 30
	
	
System.out.println("........Print All Values...........");
System.out.println("           ");


for(int row=0; row<nums.length;row++) {
	for(int column=0; column<nums[row].length; column++) {
		System.out.print(nums[row][column]+ " ");
	}
}
	
	
	System.out.println("   STRING ARRAY               ");	
	
	
	String [][]	month = {
			{ "January", "February","December"},
	
			{ "March", "April", "May"},
	
			{"June","July"," August"    },
			
			{"September","October","November"}
	                                                };
	
	System.out.println(month [0] [0]);
	
	System.out.println(" how we find   How many array are there ");
	
// how we find   How many arrays are there ?
	int rows=month.length;
	
	System.out.println(rows);

	System.out.println(" FIRST array includes how many elements ");
	
//	how we can find each array includes how many element
	
	int firstArray=month[0].length;
	System.out.println(firstArray);
	
	int secondArray=month[1].length;
	System.out.println(secondArray);
	
	int lastArray=month[3].length;
	System.out.println(lastArray);

	System.out.println("....... PRINT ALL VALUES OF ARRAY ......");
	
// How we print all values	
	for (int row=0; row<month.length; row++) {
		for(int col=0;col<month[row].length; col++) {
			System.out.println(month[row][col]+ " ");
		}
	}
	System.out.println(" Print With ADVANCE FOR LOOP ");
	for(String[] arrays:month) {
		for(String items:arrays)
		System.out.println(items);
	}
	
	
	}
	
}


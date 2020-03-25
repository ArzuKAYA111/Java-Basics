package com.syntax.class07;

public class WriteOddNumbers {

	public static void main(String[] args) {
		// how to print odds numbers from 1 to 20	
	
		// 1 Way incrementing by 2
		int X=1;

		while(X<=20){
			
		  System.out.println(X);
		X +=2;	
		}

		System.out.println("___________________");
		
		// 2 Way using mod and if condition
		
		int num=1;
		while (num<=20){
			
			if( num %2!=0) {
				System.out.print(num + " ");
			}
			num++;
			
		}
		
		System.out.println("___________________");
		System.out.println("___________________");	
		
		//3 way 
		
		int y=1;
		while(y<=20) {
			
			System.out.print(y++ + " ");
		y++;
	
		
		
		}
		
	}

}

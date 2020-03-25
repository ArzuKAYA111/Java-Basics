package com.syntax.class08;

public class Task1 {

	public static void main(String[] args) {

		//Print numbers from 1 to 50 except
	//	those that are divisible by 3
		
		for( int num=1; num<=50; num++ ) {
			
			if(num%3==0) {
				continue;
			}
			System.out.print(num+" ");	
		}
		
		System.out.println("                    ");
		
		System.out.println("                    ");
		
		
		
		//Print numbers from 1 to 50 that are divisible by 3	
		
for( int num=1; num<=50; num++ ) {
			
			if(num%3!=0) {
				continue;
			}
			System.out.print(num+" ");	
		}
		
	
		
	}

}

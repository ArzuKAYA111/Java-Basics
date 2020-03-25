package com.syntax.class07;

public class LoopGoodMorning {

	public static void main(String[] args) {
		
		
		int time=10;
		System.out.println("Good morning");
		System.out.println("---------------WHILE LOOP---------------");
		
		// while(time<12) {
		//	System.out.println("Good morning");	// code will execute infinitly
			
		// }
		
	
System.out.println("------------------------------");
		
		while(time<12) {
			System.out.println("Good morning");	// code will execute 1 times because time=10 
		time++;	
		}
		System.out.println("------------------------------");
		
		// how to print number from 1 to 50?
		int num=1;
		 while(num<=50) {
			 System.out.print(num +" ");
			 num++;
		 }
		 
		 System.out.println("------------------------------");
		 System.out.println("------------------------------");
		 
	// how to print numbers from 20 to 30			
	int x=20;
		while(x<=30 ) {
			System.out.print(x + " ");
			x++;
		}
		System.out.println("------------------------------");
		 System.out.println("------------------------------");
		// how to print numbers from 100 to 0	
		
		int y=100;
		while (y>=0) {
			System.out.print(y +" ");
			y--;
				
		}
	
		System.out.println("------------------------------");
		 System.out.println("------------------------------");	
		// how to print values from 10 to 1
	int z=10;
	while(z>=1) {
		System.out.print(z + " ");
		z--;
	}
	
	
	
	}

}

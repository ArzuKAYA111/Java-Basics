package com.syntax.class07;

public class HW3 {

	public static void main(String[] args) {
		
		/* Print even numbers from 20 to 1 (2 ways)*/
// 1 Way 
			
		int X=20;
			while(X>=1){
				
			  System.out.print(X + " ");
			X -=2;	
			}
			System.out.println("                   ");
			System.out.println("___________________");	
// 2 Way 
			int num=20;
			while (num>=1){
				
				if( num%2== 0) {
					System.out.print(num + " ");
				}
				num--;	
			}
			
			System.out.println("                  ");
			System.out.println("___________________");	
//3 way 
			int y=20;
			while(y>=1) {
				
				System.out.print(y-- + " ");
			y--;
			
			
			}	
		
	}

}

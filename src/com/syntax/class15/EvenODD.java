package com.syntax.class15;

public class EvenODD {
	//Create a method that will take a number and prints whether the number is even or odd.
	  
		void num(int a) {
			if (a%2==0) {
				System.out.println(a + " Even");
		}else {
			System.out.println(a +" Odd ");
		}
			}
		
		
		public static void main(String[] args) {
			
			EvenODD number=new EvenODD();
			
			number.num(3);
			number.num(6);
			
	
	

	}

}

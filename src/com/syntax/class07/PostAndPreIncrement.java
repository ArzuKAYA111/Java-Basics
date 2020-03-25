package com.syntax.class07;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		

// ++, --       post increment and decrement
//++Y , --Y     preincrement and decremen 
	
		int y=10;
		y=y++;
				System.out.println(y);
			
		System.out.println("=========");
		
		int x=10;
		x=++x;
		System.out.println(x);
		
		
		System.out.println("=========");
	
		int z;
		int A=10;
		z=y++;// post increment= first use the value and asign then increment
		System.out.println(z);
		
		System.out.println("=========");
		
		int w;
		int B=10;
		w=++B;// preincrement= first increment then use the value and asign it
		System.out.println(w);
		
		System.out.println("=========");
		int num=1;
		while (num<5) {
			System.out.println(++num);//2 3  4  5
		}
		
		System.out.println("=========");
		int num1=1;
		while (num1<5) {
			System.out.println(num1++);// 1  2 3 4 5 
		}
	}

}

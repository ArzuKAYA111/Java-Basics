package com.syntax.class07;

public class PreIncrement {

	public static void main(String[] args) {

// ++ , -- 
		// preincrement ++Y, Postincrement Y++ ,
		int z;
		int y=10;
		z=y++;// Postincrement first use the variables then increment 
		System.out.println(z);
		
		System.out.println(".....................................");
		
		int w;
		int x=10;
		w=++x; // Preincrement directly use value and increment it  
		
		System.out.println(w);
		
		System.out.println(".....................................");
		int num=1;
		while(num<5) {
			System.out.println(++num);
		}
		System.out.println("......................................");
		
		int num1=1;
		while(num1<5) {
			System.out.println(num1++);
		
			
		}

	}

}

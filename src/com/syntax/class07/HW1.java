package com.syntax.class07;

public class HW1 {

	public static void main(String[] args) {
		/*Print numbers from 1 to 100 in 1 line with space
 */   
	//FIRST WAY	
		
	int num=1;	
	
	while(num<=100)	{
		System.out.print(num +" ");
	num++;	
	}
	System.out.println(".............................");	
	System.out.println(".............................");
	
	// SECOND WAY
	
	for(int x=1; x<=100; x++) {
		System.out.print(x +" ");
	}
	System.out.println(".............................");	
	System.out.println(".............................");
	
	//THIRD WAY
	
	int Y=1;
	
	do {
		System.out.print(Y++ +" ");
	
	}while(Y<=100);
	Y++;
	}

}


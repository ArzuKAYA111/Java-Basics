package com.syntax.class15;

public class LargerNum {
// 	Create a method that will take 2 parameters as a numbers and prints which number is larger.
	  
	void greater(int a, int b) {
		if (a>b) {
			System.out.println(a + " is larger");
	}else {
		System.out.println(b +" is larger");
	}
		}
	
	
	public static void main(String[] args) {
		LargerNum large=new LargerNum();
		
		large.greater(20,10);
		large.greater(2,46);
		
	}

}

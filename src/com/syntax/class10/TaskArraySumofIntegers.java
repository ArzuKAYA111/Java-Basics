package com.syntax.class10;

public class TaskArraySumofIntegers {

	public static void main(String[] args) {
		
	//	Create an array on integers and calculate the sum of all integer elements in an array.
		
	
		int[] numbers= {12,16,24,46,50};
	int sum=0;
		
	for(int  i=0; i<numbers.length; i++) {
	
		sum = sum + numbers [i];
	}
	
	System.out.println(sum );
			
	}

}

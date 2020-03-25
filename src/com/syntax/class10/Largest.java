package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		// Find largest element from an array 
		
		int [] num= {200, 30,-1, 900, 56, 787,3000};
		
		int largestNum=num[0];
		for( int i=1; i<num.length; i++) {
			
			if (num[i]>largestNum ) {
				largestNum=num[i];
			}
		}
		
		System.out.println("The largest num from array is "+ largestNum);
		
		
	}

}

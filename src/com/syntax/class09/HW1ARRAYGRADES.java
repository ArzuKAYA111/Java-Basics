package com.syntax.class09;

public class HW1ARRAYGRADES {

	public static void main(String[] args) {
		/*Create an array of chars and store grades into it:
		 *  A,B,C,D,E,F. Then print a grade B (use 2 different
		 *   ways of creating an array).
 */
	// 1 WAY
		
	char [] grades;
	grades=new char[6];
	grades[0]='A';
	grades[1]='B';
	grades[2]='C';
	grades[3]='D';
	grades[4]='E';
	grades[5]='F';
	
	System.out.println(grades[1]);
	
	System.out.println(grades);
	
	System.out.println("               ");
	
	
//2 WAY
	char[] grads1={ 'A','B','C','D','E','F'};
	
	System.out.println(grades[1]);
	
	System.out.println(grades);
	
	// Getting all elements (HOCADAN)
	
	for ( int i=0; i<grades.length; i++) {
		System.out.println(grades [i]);
	}
	
	
	}

}

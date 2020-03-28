package com.syntax.class17;

public class Task1 {//   1 WAY
	
/* Create a method that will accept an array as parameters and will return
 *  a sum of all elements from that array. Method should be visibly only 
 *  within same package and accessible by the creating an instance of the class.*/
	
	//Method should be visibly only  within same package ....>means it can be default or protected
	
	
	protected static int sum( int [] num){
	int sum= 0;	
	
  for ( int i= 0 ; i<num.length; i++) {  
	sum+=num[i];
    }
	return sum;
	}
	
	
	
	public static void main(String[] args) {
		
		Task1 obj=new Task1(); // create instance of the class( object)
		
		int[] numbers= { 3,6,8,9,3,5,6};
		
		obj.sum( numbers); //accessing by the creating an instance of the class
	
	System.out.println(	obj.sum( numbers));	
	}

}

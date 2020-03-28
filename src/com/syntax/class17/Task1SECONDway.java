package com.syntax.class17;

public class Task1SECONDway {    // 2 WAY
	
/* Create a method that will accept an array as parameters and will return
 *  a sum of all elements from that array. Method should be visibly only 
 *  within same package and accessible by the creating an instance of the class.*/
	
	
	
	//Method should be visibly only  within same package ....>means it can be default or protected
	
	// accessible by the creating an instance of the class.... > it means method include instance variable

	int sum=0; // instance variable 
	
// it has instance variable so method can not be static it can access only by using instance of the class 
	
	protected int sum( int [] num){// instance method or non static method
		 sum= 0;	
	
  for ( int i= 0 ; i<num.length; i++) {
	sum+=num[i];
    }
	return sum;
	}
	
	public static void main(String[] args) {
		
		Task1SECONDway obj=new Task1SECONDway(); // creating instance of the class( object)
		
		int[] numbers= { 3,6,8,9,3,5,6};
		
		obj.sum( numbers); //accessing by the creating an instance of the class
	
	System.out.println(	obj.sum( numbers));	
	}

}

package com.syntax.class30;
import java.util.Iterator;
import java.util.LinkedList;

/* Create a collection of integers in which you can keep duplicates. 
 Write a logic to find sum of all integers
*/
public class Sum {

	public static void main(String[] args) {
		
		LinkedList<Integer> arr= new LinkedList<>();
		
		arr.add(34);
		arr.add(57);
		arr.add(34);
		arr.add(10);
		arr.add(100);
		arr.add(10);
		
		                                                                     System.out.println("     ");
		System.out.println(arr);
		
		int total=0;
		for( Integer sum:arr) {
			total+=sum;
		}
	
		System.out.println("Sum of all integers =" +total);
	
		
		
		Iterator<Integer>it=arr.iterator();
		int totl=0;
		while( it.hasNext()) {
			int nums=it.next();
			totl+=nums;
		}
		
		System.out.println("Sum of all integers =" +totl);
		
		
		
		
		
		
	}

}

package com.syntax.class26;

import java.util.ArrayList;

/* Complete task below 
 * Create a generic ArrayList that will store 5 names into it. 
Find out whether the given ArrayList is empty or not? 
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that */
public class Task {

	public static void main(String[] args) {
		
	ArrayList<String> names=new ArrayList<>();
	names.add("Azra");
	names.add("Adile");
	names.add("Guljemal");
	names.add("Tugba");
	names.add("Patyshagul");
	
	
	boolean isempty= names.isEmpty();
	System.out.println("Is arrayList empty? "+isempty );
	
	
	boolean iscontain=names.contains("Guljemal");
	System.out.println("Does arrayList contain Guljemal? "+ iscontain);
	
	boolean iscontains=names.contains("Arzu");
	System.out.println("Does arrayList contain Arzu? "+ iscontains);

	int arrSize=names.size();
	System.out.println("How many elements does arrayList have? "+ arrSize + " elements");

	
	System.out.println("What are the elements of arrayList ?");
	for (String nameList:names) {
		System.out.println(nameList);
	   }
	
  }
}

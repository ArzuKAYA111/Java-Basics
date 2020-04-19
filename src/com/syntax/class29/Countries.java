package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Create a Set collection in which you need to add names of the countries. In this set we
want all objects to be sorted in alphabetical order. Using 2 different ways retrieve all
elements from set.*/
public class Countries {

	public static void main(String[] args) {
		Set<String> hset=new HashSet<>();
		hset.add("Turkey");
		hset.add("Russia");
		hset.add("USA");
		hset.add("Iraq");
		hset.add("Argentina");
		hset.add("Kazakhistan");
		hset.add("Tajikistan"); 
		System.out.println("...............Iterator ....... ");
		
		Iterator<String> it=hset.iterator();
		while(it.hasNext()) {
			String	str=it.next();
			
			System.out.println(str);
		}
		System.out.println("...............For advance ....... ");
		
		for( String str:hset) {
			System.out.println(str);
		}

	}

}

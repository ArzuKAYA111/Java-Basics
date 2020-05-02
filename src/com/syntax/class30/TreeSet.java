package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* Create the collection that will store single uniques
 *  Objects of a String type in which order is preserved.
1.	Write a logic to concatenate all string from the collection.
*/
public class TreeSet {

	public static void main(java.lang.String[] args) {
	Set<String> Ls= new LinkedHashSet<>();
	Ls.add("Stay away from");
	Ls.add("negative People.");  
	Ls.add("They have problem");
	Ls.add("for every solution");
	Ls.add("….... Albert Einstein");
	
	System.out.println("..................Iterator............");
	Iterator<String> it= Ls.iterator();
	while (it.hasNext()) {
		String str=it.next();
		System.out.print(str+" ");
	}
	System.out.println("   ");
	System.out.println("..................For Advance............");
	for(String Y:Ls) {
		System.out.print(Y+" ");
		
	}
	}

}

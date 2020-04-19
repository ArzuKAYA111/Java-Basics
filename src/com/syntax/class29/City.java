package com.syntax.class29;
/*2. Create a Set of cities in which you want to make sure that insertion order is maintained.
Using Iterator remove any city that starts with “A”; */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class City {

	public static void main(String[] args) {
		Set<String> hset=new HashSet<>();
		hset.add("Ankara");
		hset.add("Dallas");
		hset.add("Buenos Aires");
		hset.add("Kirkuk");
		hset.add("Aktobe");
		hset.add("London");
		hset.add("Tokyo"); 
		
		
		Iterator<String> it=hset.iterator();
		while(it.hasNext()) {
			String	str=it.next();
			if (str.startsWith("A")) {
				it.remove();
			}
		
		}
		System.out.println(hset);
		
		System.out.println("    ");
		
		for( String str:hset) {
			System.out.println(str);
		}

	}

}

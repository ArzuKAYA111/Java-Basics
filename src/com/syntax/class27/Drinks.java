package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

/* //3. Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. */
public class Drinks {
public static void main(String[] args) {
	
	ArrayList<String> drink= new ArrayList<>();
	drink.add("Water");
	drink.add("Milk");
    drink.add("Cola");
    drink.add("Juice");
      
    
    Iterator<String> it=drink.iterator();
    String Drnk;
	while(it.hasNext()) {
		String Dr=it.next();
		if (Dr.contains("a")||Dr.contains("e")) {
		Drnk=Dr.replaceAll(Dr,"Water" );
		}else {
			 Drnk=Dr;		
	}
		System.out.println(Drnk);
	}
}

}





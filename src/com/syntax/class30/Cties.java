package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/*Create a Map from array of cities that will sort keys in alphabetical order. 
 * As a key store the name of the city and as a value store the length of the city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
  If any city name is more than 7 characters remove that city . */
public class Cties {

	public static void main(String[] args) {
		
TreeMap<String,Integer> Cties=new TreeMap<>();

Cties.put("London", 6);
Cties.put("Dallas", 6);
Cties.put("Istanbul", 8);
Cties.put("Paris", 5);
Cties.put("Van", 3);
Cties.put("Waco", 6);
Cties.put("Izmir", 6);

System.out.println(Cties);
System.out.println("  ");

//remove entries  : using    .entrySet()
Collection<Entry<String,Integer>> key=Cties.entrySet();

Iterator<Entry<String,Integer>> it=key.iterator();
	while (it.hasNext()) {
		Entry<String,Integer> C=it.next();
		if(C.getValue()>7) {
			it.remove();
}	}
	System.out.println(".................. After remove using entrySet()............  ");
	System.out.println(Cties);
	
	                                                                                System.out.println("   ");
	// remove  :using  .keySet()
	                                                                                
	Collection <String> Key=Cties.keySet();
	
	Iterator<String> itt=Key.iterator();
	while( itt.hasNext()) {
		if (itt.next().length()>7) {
			itt.remove();
		}
	}
	System.out.println(".................. After remove using keySet()............  ");
	System.out.println(Cties);

}

	}



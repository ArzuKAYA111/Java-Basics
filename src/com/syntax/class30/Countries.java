package com.syntax.class30;
/* Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 */

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Countries {

	public static void main(String[] args) {
			Map<String,String> Tmap=new TreeMap<>();
			Tmap.put("Turkey","Ankara");
			Tmap.put("Russia","Moskow");
			Tmap.put("USA","Washington DC");
			Tmap.put("Iraq","Bagdat");
			Tmap.put("Argentina","Bounes Aires");
			Tmap.put("Kazakhistan","Nursultan");
			Tmap.put("Tajikistan","Dushanbe"); 
			
			System.out.println("...............key by for advance ....... ");
	
			for(String key:Tmap.keySet()) {
				System.out.println("Key ..."+ key );
			}
			
			System.out.println("...............key by Iterator ....... ");
			
			Iterator<String> it=Tmap.keySet().iterator();
			while(it.hasNext()) {
				String	keys=it.next();
				
				System.out.println("Key="+keys);
			}
			System.out.println("...............values by For advance ....... ");
			
			for( String values:Tmap.values()) {
				System.out.println("Value:"+values);
			}
			System.out.println("...............values by  Iterator ....... ");

			Iterator<String> iter=Tmap.values().iterator();
			while(iter.hasNext()) {
				String	values=iter.next();
				
				System.out.println("Key="+values);
			}
			
		}

	}

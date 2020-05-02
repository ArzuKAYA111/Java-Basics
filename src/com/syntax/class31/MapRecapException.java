package com.syntax.class31;

import java.util.Hashtable;
import java.util.Map;

public class MapRecapException {// bunu ben ekledim asel yapmadi

	public static void main(String[] args) {
		try {
			Map<String, String> htable = new Hashtable<>();
			htable.put("USA", "Washington DC");
			htable.put("Russia", "Moscow");
			htable.put("France", "Paris");
			htable.put("Tajikistan", "Dushanbe");
			htable.put("Italy", null);
			System.out.println(htable);
			}
			catch(Exception e) {
				System.out.println("Exception is " + e.getMessage());
			}	
	
		
	}

}

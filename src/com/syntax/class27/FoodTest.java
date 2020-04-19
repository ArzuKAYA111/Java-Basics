package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {
		//store Foods into arraylist
				ArrayList<Food> fd=new ArrayList<>();
				fd.add(new Vegetables("vegetables"));
				fd.add(new Fruits("Fruits"));
				fd.add(new Sweets("Sweets"));
				
//calling available methods using: for loop
				
				for(int i=0; i<  fd.size(); i++) {
					 fd.get(i).eat();
					 fd.get(i).cook();
					 fd.get(i).healthy();
				}
				
				System.out.println(" ");
//calling available methods using: advanced for loop
				
				for(Food F:fd) {
					F.eat();
					F.cook();
					F.healthy();
				}
				
				System.out.println("   ");
				
//calling available methods using: iterator
			
				Iterator<Food> it=fd.iterator();
				while (it.hasNext()) {
					Food A=it.next();
					A.eat();
					A.cook();
					A.healthy();
			   }
			}	
	}


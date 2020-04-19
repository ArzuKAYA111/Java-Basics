package com.syntax.class27;

//1. hw to call available methods using: for loop, advanced for loop, iterator
import java.util.ArrayList; 
import java.util.Iterator;

public class FlowerTest {

public static void main(String[] args) {
		
		// store flowers into array
		Flower [] flowerArray={new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower")};

		//store flowers into arraylist
		ArrayList<Flower> flowers=new ArrayList<>();
		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));
		//flowers.add("Rose");cannot add String Object into ArrayList of Flower Objects

//calling available methods using: for loop
		
		for(int i=0; i< flowers.size(); i++) {
			flowers.get(i).bloom();
			
		}
		
		System.out.println(" ");
		
//calling available methods using: advanced for loop
		
		for(Flower flw:flowers) {
			flw.bloom();
		}
		
		System.out.println("   ");
		
//calling available methods using: iterator
	
		Iterator<Flower> it=flowers.iterator();
		while (it.hasNext()) {
			it.next().bloom();
	   }
	}
}
package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		
		ArrayList<Insurance> In=new ArrayList<>();
		In.add(new Car("Liberty Mutual","BMW"));
		In.add(new Pet ("Healthy Paws","German Shepard"));
		In.add(new Health ("United Health"));
		
		System.out.println("...................... FOR ADVANCE ..............");
		
		for(Insurance I:In) {
			I.getQuote();
			I.cancelInsurance();
			System.out.println("     ");
	}
		System.out.println("...................... FOR REGULAR ..............");
		
		for(int i=0; i<In.size();i++) {
			In.get(i).getQuote();
			In.get(i).cancelInsurance();
			System.out.println(" ");
	}
		System.out.println("...................... ITERATOR ..............");
          
		Iterator<Insurance> it= In.iterator();
		
		while( it.hasNext()){
			Insurance ins=it.next();
			ins.getQuote();
			ins.cancelInsurance();
			System.out.println("    ");
			
		}
	}
}

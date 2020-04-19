package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StroringDifferentObjects {

	public static void main(String[] args) {
		
		Set<Insurance> hset=new HashSet<>();//Type i Coverage yaparsak sadece method() mehodunu access yapabilecegimiz icin type'i Insurance yaptik 
		hset.add(new Car("Geico", "BMW"));
		hset.add(new Pet("Progressive", "Dog"));
		hset.add(new Health("BCBS"));
		
		System.out.println(hset.size());
		
		Iterator<Insurance> it=hset.iterator();
		while(it.hasNext()) {
			//Insurance ins= new Car("Geico", "BMW")
			//we need to assing it to the variable because if we use it.next() --> moves to the next element
			Insurance ins=it.next();
			ins.getQuote();
			ins.cancelInsurance();
			ins.method();
			//obj.display --> won't be available to insurance type(display()methodu Insurance ta tanimlanmamis
			System.out.println("----------------------");
		}
	}
}
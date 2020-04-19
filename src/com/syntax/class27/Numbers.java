package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

/*//4. Create an arrayList of even numbers from 1 to 50. 
 * Using Iterator remove any number that is divisible by 5 from that arrayList.*/
public class Numbers {

	public static void main(String[] args) {
		ArrayList<Integer> EN = new ArrayList<>();
		for (int i = 1; i < 50; i++) {
			if (i % 2 == 0) {
				EN.add(i);
			}
		}

		Iterator<Integer> it = EN.iterator();
	
		while (it.hasNext()) {
			if (it.next() % 5 == 0) {
				it.remove();
			}
		}
		System.out.print(EN);
	}
}

package com.syntax.class30;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
/*Create a Map that will store Employee name and salary.Write a logic to retrieve an employee who gets the highest salary.
 *  Output should be in the below format
John Smith=$100000
 */
public class Employee {

	public static void main(String[] args) {
                                                                                                                                          System.out.println("  ");
		HashMap<String, Integer> Ep = new HashMap<>();
		Ep.put("Jane Ryan", 75000);
		Ep.put("Robert Perry", 85000);
		Ep.put("Richard Fey", 90000);
		Ep.put("George Wood", 60000);
		Ep.put("Brian Chase", 120000);
		Ep.put("Jane Allen", 70000);

		Integer maxSalary = Collections.max(Ep.values());// logic to retrieve an employee who gets the highest salary
		System.out.println("Maximum Salary =" + maxSalary);

		Collection<Entry<String, Integer>> Centries = Ep.entrySet();// stored map entries into the collection using entrySet()

		System.out.println("......................USING ITERATOR.....................  ");
		
		Iterator<Entry<String, Integer>> it = Centries.iterator();

		while (it.hasNext()) {
			Entry<String, Integer> I = it.next();
			if (I.getValue() == maxSalary) {

				System.out.println(I.getKey() + " =$" + I.getValue());

			}

		}
		System.out.println("......................USING For Advance.....................  ");
		for (Entry<String, Integer> FA : Centries) {
			if (FA.getValue() == maxSalary) {

				System.out.println(FA.getKey() + " =$" + FA.getValue());
			}
		}
	}

}

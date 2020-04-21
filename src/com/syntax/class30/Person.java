package com.syntax.class30;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
/* Create a Person class with following private fields: name, lastName, age, salary. 
•	Variables should be initialized through constructor.
•	Inside the class also create a method to print user details.
•	In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.*/
public class Person {
	private String name, lastName;
	private int age;
	private long salary;
	                    Person(String name, String lastName, int age, long salary) {
		                      this.name = name;
		                      this.lastName = lastName;
		                      this.age = age;
		                      this.salary = salary;
}
	public void userDetail() {
		System.out.println("User name is " + name + ",last name is " + lastName + ",user age is " + age
				+ " and user salary is " + salary);
}
	public static void main(String[] args) {
		Map<Long, Person> P = new TreeMap<>();
		P.put(1234L, new Person("John", "Smith", 37, 100000));
		P.put(1236L, new Person("Halil", "Koc", 42, 120000));
		P.put(1235L, new Person("Aylin", "Ince", 54, 80000));

		// 1.way to print all object details: storing Map values into Collection by using.....> Map.values()

		Collection<Person> Pc = P.values();

		for (Person pers : Pc) {
			pers.userDetail();
		}
		                                                                                                                              System.out.println("  ");
		Iterator<Person> it = Pc.iterator();
		while (it.hasNext()) {
			Person inf = it.next();
			inf.userDetail();
		}
	                                                                                                                                   	System.out.println("     ");
		// 2- Way to print all object details by using.....> Entry Set ( using  Map.entrySet() )

		Set<Entry<Long, Person>> perSet = P.entrySet();

		for (Entry<Long, Person> F : perSet) {
			F.getValue().userDetail();
		}
	                                                                                                                                    	System.out.println("  ");
		Iterator<Entry<Long, Person>> its = perSet.iterator();
		while (its.hasNext()) {
			Entry<Long, Person> E = its.next();
			E.getValue().userDetail();	
		}
                                                                                                                                          System.out.println("    ");
		// 3-Way to print all object details  by using ....> Map.keySet()  and Map.get(Key)
        
		Collection<Long> keys=P.keySet();
		
		for(Long Key:keys) {
		Person	K=P.get(Key);
			K.userDetail();
		}}}
